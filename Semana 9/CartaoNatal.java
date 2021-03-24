public class CartaoNatal extends CartaoWeb{

    public CartaoNatal(String destinatario){
		super(destinatario);
	}
    
    public void retornarMensagem(String remetente) {
        System.out.printf("%s, feliz natal!\nAbraco, %s\n\n", destinatario, remetente);
    }

}