import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        FolhaDePagamentoUFV fPag[] = new FolhaDePagamentoUFV[3];
                
        for(int i = 0; i < 3; i++){
            fPag[i] = new FolhaDePagamentoUFV();
            
            System.out.printf("Informe a matricula do funcionario %d\n",i+1);
            fPag[i].getFuncionario().setMatricula(in.nextInt());
            
            System.out.printf("Informe o nome do funcionario %d.\n",i+1);
            fPag[i].getFuncionario().setNome(in.next());
            
            System.out.printf("Informe o cargo do funcionario %d.\n",i+1);
            fPag[i].getFuncionario().setCargo(in.next());
            
            System.out.printf("Informe a data de nascimento do funcionario %d.\n",i+1);
            System.out.println("Dia DD:");
            fPag[i].getFuncionario().getDataNasc().setDia(in.nextByte());
            System.out.println("Mes MM:");
            fPag[i].getFuncionario().getDataNasc().setMes(in.nextByte());
            System.out.println("Ano:AAAA");
            fPag[i].getFuncionario().getDataNasc().setAno(in.nextShort());
            
            System.out.printf("Informe o salario do funcionario %d.\n",i+1);
            fPag[i].setSalario(in.nextDouble());
            System.out.printf("Informe o ano de pagamento do funcionario %d.\n",i+1);
            System.out.println("Mes MM:");
            fPag[i].getDataPag().setMes(in.nextByte());
            System.out.println("Mes AAAA:");
            fPag[i].getDataPag().setAno(in.nextShort());
        }
        
        for(int i = 0; i < 3; i++){
           System.out.printf("Dados do funcionario %d:",i+1);
           fPag[i].imprimirFolha();
           System.out.printf("\n\n");
        }
    }
}