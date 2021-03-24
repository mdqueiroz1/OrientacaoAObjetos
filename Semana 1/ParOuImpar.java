import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x;

        x = entrada.nextInt();
        if(x % 2 == 0){
            System.out.println(x+" eh par");
        }else{
            System.out.println(x+" eh impar");
        }

    }
}