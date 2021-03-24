import java.util.Scanner;

public class Main{
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        int num1,num2,selecao;        
        operacoes o1 = new operacoes();
        
        System.out.printf("Informe a opcao desejada:\n1-Soma\n2-Potenciacao\n3-imc");
        selecao = entrada.nextInt();        
        
        if(selecao != 3)
        System.out.println("Informe os numeros a serem calculados:");
        else
        System.out.println("Infome o peso e a altura em cm");
        
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        switch(selecao){
            case 1:{
                System.out.println(o1.soma(num1,num2));
            }
            case 2:{
                System.out.println(o1.potenciacao(num1,num2));
            }
            case 3:{
                System.out.println(o1.imc(num1,num2));
            }
        }
    }
}