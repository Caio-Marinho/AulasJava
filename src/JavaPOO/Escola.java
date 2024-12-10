package JavaPOO;

public class Escola {
	public static void main(String[] args) {
		Aluno estudante = new Aluno("Caio","12345678910","81979056770",7.90);
		Professor docente = new Professor("Well","098765432101","81999930751",5000);
		
		estudante.Acordar();
		estudante.Sofrer();
		docente.Trabalhar();
		docente.AplicarProva();
	}
}