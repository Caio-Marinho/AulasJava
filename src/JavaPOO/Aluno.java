package JavaPOO;

public class Aluno extends Pessoa{
	public double nota;
	
	public Aluno (String nome,String cpf,String telefone,double nota) {
		super(nome,cpf,telefone);
		this.nota = nota;
	}
	public void Sofrer() {
		System.out.printf("%s sofreu com a prova e tirou %.2f\n",this.nome,this.nota);
	}
}
