public class Cadastro {
    private String pnome, unome, email, psw;


    public String getPnome(){
        return this.pnome;
    }
    public void setPnome(String pn){
        this.pnome = pn;
    }

    public String getUnome(){
        return this.unome;
    }
    public void setUnome(String un){
        this.unome = un;
    } 

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String e){
        if(e.indexOf('@') >= 2 && e.indexOf('.') > e.indexOf('@')){
            this.email = e;
        }
    }

    public String getPsw(){
        return this.psw;
    }
    public void setPsw(String pw){
        if(pw.length() >= 8){
            this.psw = pw;
        }
    }

    public void imprimir(){
        System.out.println("Cadastro:");
        System.out.printf("\n\nNome: %s %s\n",getPnome(),getUnome());
        System.out.printf("Email:%s\nSenha:%s\n", getEmail(),getPsw());
    }
}
