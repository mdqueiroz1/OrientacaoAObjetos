public abstract class CartaoWeb {
    protected String destinatario;

    protected CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }

    public abstract void retornarMensagem(String remetente);
}
