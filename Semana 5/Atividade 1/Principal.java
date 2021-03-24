import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tempo t[] =  new Tempo[5];
        
        for(int i = 0; i < 5; i++) {
            t[i] = new Tempo();
            switch(i){
                case 1:
                    System.out.println("Informe a hora:");
                    t[1] = new Tempo(in.nextByte());
                    break;
                case 2:
                    System.out.println("Informe a hora e minutos:");
                    t[2] = new Tempo(in.nextByte(),in.nextShort());
                    break;
                case 3:
                    System.out.println("Informe a hora e segundos:");
                    t[3] = new Tempo(in.nextByte(),in.nextInt());
                    break;
                case 4:
                    System.out.println("Informe a hora, minutos e segundos:");
                    t[4] = new Tempo(in.nextByte(),in.nextShort(),in.nextInt());
                    break;
                case 5:
                    t[5] = new Tempo();
                    break; 
                default:
                    break;
            }

                
        }
        
        
        
        
        for(int i = 0; i < 5; i++){
            System.out.printf("\nHora Formatada: ");
            System.out.println(t[i].toString());
        }
    
    }

}
