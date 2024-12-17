package Acabou;

public class TriAtleta implements Ciclista,Nadador,Corredor {
	public String nome;
	public int idade;
	
	public TriAtleta(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public void aquecer() {
		System.out.printf("%s está aquecido\n",nome);
	}
	
	@Override
	public void correr() {
		System.out.printf("%s está correndo\n",nome);
	}

	@Override
	public void pedalar() {
		System.out.printf("%s está pedalando\n",nome);
	}
	@Override
	public void nadar() {
		System.out.printf("%s está nadando\n",nome);
	}
	
}
