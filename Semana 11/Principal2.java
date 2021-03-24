import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean continua = true;
        
        do{

            try {
                double temperatura;
                System.out.println("Informe o valor a ser convertido.");
                temperatura = in.nextDouble();
                converteF2C(temperatura);
                continua = false;
            } catch (TemperatureException e) {
                System.err.println("Erro!");
            }

        }while(continua);
    }
    public static void converteF2C(double f) throws TemperatureException{
        double celsius;
        celsius = (5 * (f - 32)) / 9;
        System.out.printf("Valor em Celsius: %.2f", celsius);
    }
}
