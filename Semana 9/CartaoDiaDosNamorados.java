public class CartaoDiaDosNamorados extends CartaoWeb{
    
	public CartaoDiaDosNamorados(String destinatario){
		super(destinatario);
	}

    public void retornarMensagem(String remetente) {
        System.out.printf("%s, Feliz dia dos namorados!\nGrande abraco, %s\n\n",destinatario,remetente);
    }
}
