import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Cadastro cad[] = new Cadastro[1];

        for(int i = 0; i < 1; i++){
            cad[i] = new Cadastro();
            
            System.out.println("Informe o primeiro nome:");
            cad[i].setPnome(in.next());
            System.out.println("Informe o ultimo nome:");
            cad[i].setUnome(in.next());
            System.out.println("Informe o email:");
            cad[i].setEmail(in.next());
            System.out.println("Informe a senha:");
            cad[i].setPsw(in.next());
        }
        
        for(int i = 0; i < 1; i++){
            cad[i].imprimir();
        }
    }
}
