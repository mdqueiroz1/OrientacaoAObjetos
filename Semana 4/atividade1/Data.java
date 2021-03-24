public class Data{
    private byte dia, mes;
    private short ano;

    public byte getDia(){
        return this.dia;
    }
    
    public byte getMes(){
        return this.mes;
    }
    
    public short getAno(){
        return this.ano;
    }
    
    public void setDia(byte dia){
        if(dia > 0 && dia <= 31){
            this.dia = dia;
	}
    }
    
    public void setMes(byte mes){
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }
    }
    
    public void setAno(short ano){
        if(ano > 1900 && ano <= 2020){
            this.ano = ano; 
        }
    }
}