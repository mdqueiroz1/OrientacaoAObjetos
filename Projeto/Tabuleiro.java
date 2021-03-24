import java.util.Random;

public class Tabuleiro {
    
    
    Sala s[][] = new Sala[5][5];
    
    
    Random r = new Random(); 
    int nRand= r.nextInt(75);
    
    Entidade jogador[] = new Entidade[3];

    public void inicializaSalas(){
        //Deixando todas as portas abertas, exceto as paredes.
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                s[i][j] = new Sala();
                s[i][j].setPorta1('*');
                s[i][j].setPorta2('*');
                s[i][j].setPorta3('*');
                s[i][j].setPorta4('*');
                if (j == 0) {
                    s[i][j].setPorta2('|');
                }
                if(i == 0){
                    s[i][j].setPorta1('-');
                }
                if (j == 4) {
                    s[i][j].setPorta3('|');
                }
                if (i == 4) {
                    s[i][j].setPorta4('-');
                }
            }
        }

        //Fechando portas aleatoriamente, deixando o setor [3,3] com todas as 4 portas abertas.
        for(int i = 0; i < 4 ; i++){
            for(int j = 0; j < 4; j++){
                if (s[i][j].getPorta3() == '*' && i!=2 && j!=2) {
                  nRand = r.nextInt(100);
                  if(nRand > 40){
                      s[i][j].setPorta3('|');
                      s[i][j+1].setPorta2('|');
                  }
                }
                if(s[i][j].getPorta4() == '*' && i!=2 && j!=2){
                    nRand = r.nextInt(100);
                    if(nRand > 40){
                        s[i][j].setPorta4('-');
                        s[i+1][j].setPorta1('-');
                    }
                }
            }
        }

        //inicializando os jogadores
        for(int i = 0; i < 3; i++){
            jogador[i] = new Entidade();
            jogador[i].setP1((byte)2);    
            jogador[i].setP2((byte)2);
        }
        //setando valor de atk e def de cada jogador
        jogador[0].setAtk((byte)2);
        jogador[0].setDef((byte)6);
        jogador[1].setAtk((byte)1);
        jogador[1].setDef((byte)7);

        //setando lugar do virus aleatoriamente fora do centro do tabuleiro
        do{
            nRand = r.nextInt(4);
            jogador[2].setP1((byte)nRand);
            nRand = r.nextInt(4);
            jogador[2].setP2((byte)nRand);
        }while(jogador[2].getP1() != 2 && jogador[2].getP2() != 2);
        
    }

    public void printSala(){
        if(jogador[0].getP1() == jogador[1].getP1() && jogador[0].getP2() == jogador[1].getP2()){
            
            System.out.println("----------------------------");
            System.out.println("|   Antivirus por um dia   |");
            System.out.println("----------------------------");
            System.out.printf("   1   2   3   4   5\n ");
            for(int i = 0; i<11; i++){
                for(int j = 0; j < 5 ; j++){
                    if (i != 10) {
                        if(i % 2 == 0){
                            System.out.printf("|-%c-", s[i/2][j].getPorta1());
                        }else{
                            if ((jogador[0].getP1()*2)+1 == i && jogador[0].getP2() == j){
                                System.out.printf("%c P ",s[i/2][j].getPorta2());
                            }else{
                                System.out.printf("%c   ",s[i/2][j].getPorta2(),i,j);
                            }
                        }
                    }else{
                        System.out.printf("|---");
                    }
                }
                if (i%2 == 0 && i<10) {
                    System.out.printf("|\n%d",(i/2)+1);
                }else{
                    System.out.printf("|\n ");
                }
            }
        }else{
           System.out.println("----------------------------");
            System.out.println("|   Antivirus por um dia   |");
            System.out.println("----------------------------");
            System.out.printf("   1   2   3   4   5\n ");
            for(int i = 0; i<11; i++){
                for(int j = 0; j < 5 ; j++){
                    if (i != 10) {
                        if(i % 2 == 0){
                            System.out.printf("|-%c-", s[i/2][j].getPorta1());
                        }else{
                            if ((jogador[0].getP1()*2)+1 == i && jogador[0].getP2() == j){
                                System.out.printf("%cP1 ",s[i/2][j].getPorta2());
                            }else{
                                if ((jogador[1].getP1()*2)+1 == i && jogador[1].getP2() == j){
                                    System.out.printf("%cP2 ",s[i/2][j].getPorta2());
                                }else{
                                    System.out.printf("%c   ",s[i/2][j].getPorta2(),i,j);
                                }
                            }
                        }
                    }else{
                        System.out.printf("|---");
                    }
                }
                if (i%2 == 0 && i<10) {
                    System.out.printf("|\n%d",(i/2)+1);
                }else{
                    System.out.printf("|\n ");
                }
            }
        }

        System.out.printf("Jogador 1: Setor:[%d,%d]\n", (jogador[0].getP1())+1, (jogador[0].getP2()+1));
        System.out.printf(" Jogador 2: Setor:[%d,%d]\n", (jogador[1].getP1())+1, (jogador[1].getP2()+1));
    }


}
