import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Tabuleiro t = new Tabuleiro();
        t.inicializaSalas();
        int cont=0,menu,p;
        p = 0;
        
        do{
            t.printSala();
            System.out.printf("Turno do jogador %d\n", p+1);
            System.out.println("1-Mover personagem");
            System.out.println("2- Sair do programa.");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    char movimento;
                    System.out.println("w para subir, a para esquerda, s para baixo, d para direita");
                    movimento = in.next().charAt(0);
                    switch (movimento) {
                        case 'w':
                            t.jogador[p].movimentaCima(t.s[t.jogador[p].getP1()][t.jogador[p].getP2()].getPorta1());
                            cont++;
                        break;
                        
                        case 'a':
                            t.jogador[p].movimentaEsq(t.s[t.jogador[p].getP1()][t.jogador[p].getP2()].getPorta2());
                            cont++;
                        break;
                        
                        case 's':
                            t.jogador[p].movimentaBaixo(t.s[t.jogador[p].getP1()][t.jogador[p].getP2()].getPorta4());
                            cont++;
                        break;

                        case'd':
                            t.jogador[p].movimentaDir(t.s[t.jogador[p].getP1()][t.jogador[p].getP2()].getPorta3());
                            cont++;
                        break;

                        default:
                            System.out.println("Valor inválido.");
                            break;
                    }
                    if(t.jogador[p].testaVirus(t.jogador[p].getP1(), t.jogador[p].getP2(),t.jogador[2].getP1(),t.jogador[2].getP2(),p)){
                        cont = 25;
                    }
                break;
            
                case 2:
                    cont = 25;
                break;

                default:
                    break;
            }
            if(p == 1){
                p = 0;
            }else{
                p++;
            }
        }while(cont < 25);
        
    }
}
