public class pessoa{
	int dia, mes, ano;

	public void armazenar(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void imprimir(){
		System.out.printf("Data de nascimento: %d/%d/%d",dia,mes,ano);
	}
}