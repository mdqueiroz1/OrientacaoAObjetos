import java.util.Scanner;

public class Main{
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        
        pessoa p1 = new pessoa();
        
        int dia,mes,ano;
        System.out.println("Informe o dia mes e ano no formato DD MM AAAA");
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        ano = entrada.nextInt();
        
        p1.armazenar(dia, mes, ano);
        p1.imprimir();
    }
}