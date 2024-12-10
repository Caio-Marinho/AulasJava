package Poli;

public class Cavalo extends Mamifero{
	public Cavalo(String nome) {
		super(nome);
	}
	public void Locomover() {
		System.out.printf("%s que é um cavalo está trotando\n",nome);
	}
	public void Comer(String comida) {
		System.out.printf("%s come %s\n",nome,comida);
	}
}