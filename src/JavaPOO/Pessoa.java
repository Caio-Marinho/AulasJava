package JavaPOO;

public abstract class Pessoa {
	public String nome;
	public String cpf;
	public String telefone;
	
	public Pessoa (String nome,String cpf,String telefone){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public void Acordar() {
		System.out.printf("%s está acordado!\n",this.nome);
	}
	public void Domir() {
		System.out.printf("%s está dormindo\n",this.nome);
	}
	public void Trabalhar() {
		System.out.printf("%s está trabalhando\n",this.nome);
	}
}
