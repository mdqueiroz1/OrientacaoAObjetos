public class FuncionarioMensalista extends Funcionario{
    double salario;

    public FuncionarioMensalista(String nome, int matricula, double salario){
        super(nome, matricula);
        this.salario = salario;
    }

	public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println("Funcionario Mensalista:");
        System.out.printf("\n\nNome: %s\nMatricula: %d\nSalario: %.2f"
        ,this.nome,this.matricula, this.salario);
    }
}