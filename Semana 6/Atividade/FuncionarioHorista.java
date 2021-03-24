public class FuncionarioHorista extends Funcionario{
    private short horaTrabalhada;
    private double valorHora, salario;
	private String salarioFinal;
    
    public FuncionarioHorista(String nome, int matricula, short horaTrabalhada, double valorHora){
        super(nome, matricula);
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
        this.salario = horaTrabalhada*valorHora;
    }

    public short getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(short horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora > 0){
            this.valorHora = valorHora;
        }
    }
    
    public void salarioFinal(){
        System.out.printf("Salario final: %.2f", valorHora*horaTrabalhada);
    }
    
    public void imprimir(){
        System.out.println("Funcionario horista:");
        System.out.printf("\n\nNome: %s\nMatricula: %d\nHoras trabalhadas: %d\nValor da hora trabalhada: %.2f\n",
                        this.nome, this.matricula,this.horaTrabalhada,this.valorHora);
    }
}
