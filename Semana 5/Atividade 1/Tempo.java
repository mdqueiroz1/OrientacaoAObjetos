public class Tempo {
    private byte hora;
    private short minutos;
    private int segundos;

    //construtores
    public Tempo(){
        this((byte)0,(short)0,0);
    }

    public Tempo(byte hora){
        this(hora,(short)0,0);
    }

    public Tempo(byte hora, short minutos){
        this(hora,minutos,0);
    }

    public Tempo(byte i, short j, int segundos) {
        this.hora = i;
        this.minutos = j;
        this.segundos = segundos;
    }

    public Tempo(byte hora, int segundos){
        this(hora, (short)0, segundos);
    }

    // declaração de get e set
    public byte getHora() {
        return this.hora;
    }

    public void setHora(byte h) {
        if(h > 0 || h < 24){
            this.hora = h;
        }
    }

    public short getMinutos(){
        return this.minutos;
    }
    public void setMinutos(short m){
        if(m >= 0 || m <= 60){
            this.minutos = m;
        }
    }

    public int getSegundos(){
        return this.segundos;
    }
    public void setSegundos(int s){
        if(s >= 0 || s <= 60){
            this.segundos = s;
        }
    }

    public String toString() {
        return String.format(getHora()+":"+getMinutos()+":"+getSegundos());
    }

}
