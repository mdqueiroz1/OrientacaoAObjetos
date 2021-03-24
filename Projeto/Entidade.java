public class Entidade extends Mob{

    //Sala s = new Sala();

    public Entidade(){
    }

    //Declaração dos metodos.
    
    public void atacaInimigo(Entidade jogador, Entidade inimigo) {
        inimigo.setDef((byte)(inimigo.getDef() - jogador.getAtk()));
    }
    
    public void movimentaCima(char porta) {
        if(porta == '*'){
            setP1((byte) (getP1() - 1));
        }else{
            System.out.println("Porta fechada!");
        }

    }
    
    public void movimentaBaixo(char porta) {
        if(porta == '*'){
            setP1((byte) (getP1() + 1));
        }else{
            System.out.println("Porta fechada!");
        }
    }
    
    public void movimentaEsq(char porta) {
        if(porta == '*'){
            setP2((byte) (getP2() - 1));
        }else{
            System.out.println("Porta fechada!");
        }
    }
    
    public void movimentaDir(char porta) {
        if(porta == '*'){
           setP2((byte) (getP2() + 1));
        }else{
            System.out.println("Porta fechada!");
        }
    }

    public boolean testaVirus(byte jP1, byte jP2,byte vP1, byte vP2,int jogador){
        if(jP1 == vP1 && jP2 == vP2){
            System.out.printf("Jogador %d encontrou o virus!\n Você ganhou!\n",jogador+1);
            return true;
        }
        return false;
    }
}

