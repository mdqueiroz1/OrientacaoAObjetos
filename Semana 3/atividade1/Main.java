import java.util.Scanner;

public class Main{
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        
        Televisao c1 = new Televisao(true,false,0,"HDMI 1");
        Televisao c2 = new Televisao(true, 32, "TV");
        Televisao c3 = new Televisao(true, "Analogico");
        Televisao c4 = new Televisao(false);
        Televisao c5 = new Televisao("HDMI 2");
    }
}