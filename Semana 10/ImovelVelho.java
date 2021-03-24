public class ImovelVelho extends Imovel{
    int m2;
    double valorTotal,valorM2, depreciacao;

    //o valor de 4% é aplicado como depreciação anual para imóveis
    //fonte: https://classecontabil.com.br/depreciacao-de-imoveis/

    @Override
    public double calcularValorImovel(int m2, double valorM2) {
        valorTotal = m2 * valorM2;
        depreciacao = valorTotal * 0.04;
        valorImovel = valorTotal - depreciacao;

        return valorTotal;
    }
}
