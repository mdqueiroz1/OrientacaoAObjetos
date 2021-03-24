public class ImovelNovo extends Imovel{
    int m2;
    double valorTotal, valorM2;
    
    @Override
    public double calcularValorImovel(int m2, double valorM2) {
        valorTotal = m2 * valorM2;

        return valorTotal;
    }
}
