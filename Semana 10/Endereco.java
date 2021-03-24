public class Endereco {
    
    protected String rua, bairro, cidade, estado;
    protected int numero;

    protected Endereco(){
    }

    protected Endereco(String rua, int numero, String bairro, String cidade, String estado){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

}
