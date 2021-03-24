import java.util.Scanner;

public class Principal1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        //estava dando erro de variavel nao inicializada no x1 e x2, tive que fazer gambiarra
        double x,y,z,x1 = 0, x2 = 0,d;
        boolean continuar = true;
        do{
            try {

                System.out.println("Informe o valor de x");
                x = in.nextDouble();
                System.out.println("Informe o valor de y");
                y = in.nextDouble();
                System.out.println("Informe o valor de z");
                z = in.nextDouble();
                
                d = Math.sqrt((y*y) -4 * x * z);
                
                x1 = (-1 * y) + (d / (2*x));
                x2 = (-1 * y) - (d / (2*x));
                continuar = false;
            } catch (ArithmeticException e) {
                System.out.println("Erro: divisao por 0");
            }
        }while(continuar);           
            
        
        System.out.printf("X1 = %.2f\nX2 = %.2f", x1,x2);
    }
    
}