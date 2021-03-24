public class Funcionario {
    protected String nome;
    protected int matricula;

    public Funcionario(String nome, int matricula){
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula > 0){
            this.matricula = matricula;
        }
    }
}