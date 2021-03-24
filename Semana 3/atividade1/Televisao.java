public class Televisao{
    boolean ligado,standby;
    int tvCanal;
    String entradaCanal;
    
    public Televisao(boolean ligado, boolean standby, int tvCanal, String entradaCanal){
        this.ligado = ligado;
        this.standby = standby;
        this.tvCanal = tvCanal;
        this.entradaCanal = entradaCanal;
    }
    
    public Televisao(boolean ligado, int tvCanal, String entradaCanal){
        this.ligado = ligado;
        this.tvCanal = tvCanal;
        this.entradaCanal = entradaCanal;
    }
    
    
    public Televisao(boolean ligado, String entradaCanal){
        this.ligado = ligado;
        this.entradaCanal = entradaCanal;
    }
    
    public Televisao(boolean ligado){
        this.ligado = ligado;
    }

    public Televisao(String entradaCanal){
        this.entradaCanal = entradaCanal;
    }

    public void imprimir(){
        System.out.printf("Televisao");
    }
}