import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);

		String destinatario,remetente;
		
		System.out.println("informe o destinatario.");
		destinatario = in.nextLine();
		System.out.println("informe o remetente.");
		remetente = in.nextLine();

		CartaoWeb obj[] = new CartaoWeb[3];
		
		obj[1] = new CartaoAniversario(destinatario);
		obj[2] = new CartaoNatal(destinatario);
		obj[3] = new CartaoDiaDosNamorados(destinatario);

		for(int i = 0; i <= 3; i++) {
			obj[i].retornarMensagem(remetente);
		}
	}
}