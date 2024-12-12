package encapsulamento;

public class Animal {
	private String nome,tipo,raca,rg,tutor;
	private int idade;
	private char porte;
	
	public void ajustarNome(String nome) {
		this.nome = nome;
	}
	public void ajustarTipo(String tipo) {
		this.tipo = tipo;
	}
	public void ajustarRaca(String raca) {
		this.raca = raca;
	}
	public void ajustarIdade(int idade) {
		this.idade = idade;
	}
	public void ajustarRg(String rg) {
		this.rg = rg;
	}
	public void ajustarTutor(String tutor) {
		this.tutor = tutor;
	}
	public void ajustarPorte(char porte) {
		this.porte = porte;
	}
	public String texto() {
		return nome+" é um/uma "+tipo+" e é dá Raça "+raca+
				" e tem "+idade+" ano(s) "+ "tendo o rg "+rg+" e seu tutor é "
				+tutor+" e seu porte é "+(porte == 'p' ? "Pequeno" : porte == 'm' ? "Médio" : "Grande");
	}
}