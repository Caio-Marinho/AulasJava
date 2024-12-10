package JavaPOO;

public class Professor extends Pessoa{
	public double salario;
	
	public Professor(String nome, String cpf, String telefone,double salario) {
		super(nome, cpf, telefone);
		this.salario = salario;
		
	}
	public void AplicarProva() {
		System.out.printf("O professor %s aplicou prova\n",this.nome);
	}
}
