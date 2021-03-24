public class CartaoAniversario extends CartaoWeb{
    
    public CartaoAniversario(String destinatario){
		super(destinatario);
	}
    
    public void retornarMensagem(String remetente) {
        System.out.printf("%s, feliz aniversário! Felicidades!\n Abraco, %s\n\n",remetente,destinatario);
    }
}