import java.util.Scanner;

class Main{
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double menor,x, y, z;
        String menorStr,x1, y1, z1;
       
        x1 = entrada.next();
        x = entrada.nextDouble();
        y1 = entrada.next();
        y = entrada.nextDouble();
        z1 = entrada.next();
        z = entrada.nextDouble();
        
        menor = x;
        menorStr = x1;

        if(y < menor){
            menor = y;
            menorStr = y1;
        }
        if(z < menor){
            menor = z;
            menorStr = z1;
        }

        System.out.println("O aluno "+menorStr+" obteve a nota "+menor);

    }
}