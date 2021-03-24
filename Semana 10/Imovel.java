public abstract class Imovel{
    protected Endereco end = new Endereco();
    protected Preco p = new Preco();
    
    public abstract double calcularValorImovel(int m2, double valorM2);
}
