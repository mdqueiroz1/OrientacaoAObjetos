import java.util.Scanner;

public class Principal {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);

        /*
        FuncionarioMensalista fM = new FuncionarioMensalista("joao", 123, 1000);
        FuncionarioHorista fH = new FuncionarioHorista("pedro", 124, (short)30, 32.1);
        fM.imprimir();
        fH.imprimir();
        fH.salarioFinal();
        */
        FuncionarioMensalista fM[] = new FuncionarioMensalista[150];
        FuncionarioHorista fH[] = new FuncionarioHorista[150];
        for(int i = 0; i<150 ; i++){
            System.out.println("Informe o nome do funcionario mensalista");
            String nome = in.next();
            System.out.println("Sua matricula:");
            int matricula = in.nextInt();
            System.out.println("Seu salario:");
            double salario = in.nextDouble();
            fM[i] = new FuncionarioMensalista(nome,matricula,salario);

            System.out.println("Informe o nome do funcionario horista:");
            nome = in.next();
            System.out.println("Sua matricula:");
            matricula = in.nextInt();
            System.out.println("Horas trabalhadas");
            short horas = in.nextShort();
            System.out.println("Valor da hora trabalhada:");
            double valorHora = in.nextDouble();
            fH[i] = new FuncionarioHorista(nome,matricula,horas,valorHora);
            
            fM[i].imprimir();
            fH[i].imprimir();
            fH[i].salarioFinal();
        }
    }
}
