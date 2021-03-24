public class FolhaDePagamentoUFV{
    
    private FuncionarioUFV funcionario = new FuncionarioUFV();
    private Data dataPag = new Data();

    private double salario;
    
    public FuncionarioUFV getFuncionario(){
        return this.funcionario;
    }
    
    public Data getDataPag(){
        return this.dataPag;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setFuncionario(FuncionarioUFV f){
        this.funcionario = f;
    }
    
    public void setDataPag(Data d){
        this.dataPag = d;
    }
    
    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }
    }
    
    public void imprimirFolha(){
        System.out.printf("\nMatricula:%d\nNome: %s\nCargo:%s\n",
                           getFuncionario().getMatricula(),
                           getFuncionario().getNome(),
                           getFuncionario().getCargo());
        System.out.printf("Data de Nascimento: %d/%d/%d\n",
                            getFuncionario().getDataNasc().getDia(),
                            getFuncionario().getDataNasc().getMes(),
                            getFuncionario().getDataNasc().getAno());
        System.out.printf("Salario:%.2f\nReferente a %d/%d\n",
                            getSalario(),
                            getDataPag().getMes(),
                            getDataPag().getAno());                 
    }
}





