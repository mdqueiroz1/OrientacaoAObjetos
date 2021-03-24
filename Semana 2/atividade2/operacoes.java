public class operacoes{
    public int soma(int num1, int num2){
        int soma;
        
        soma = num1 + num2;
        
        return soma;
    }
    public double potenciacao(int num1, int num2){
        double potenciacao;
        
        potenciacao = Math.pow(num1,num2);
        
        return potenciacao;
    }
    public double imc(int num1, int num2){
        double imc;
        
        imc = num1/(num2*num2);
        
        return imc;
    }
}