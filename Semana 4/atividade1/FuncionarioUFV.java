public class FuncionarioUFV{
    
    private String nome, cargo;
    private int matricula;
    
    private Data dataNasc = new Data();
   
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public Data getDataNasc(){
        return this.dataNasc;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setDataNasc(Data d){
        this.dataNasc = d;
    }
}