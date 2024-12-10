package Poli;

public abstract class Animal {
	public String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void Locomover() {
		System.out.printf("%s se locomove\n",nome);
	}
	public void Comer() {
		System.out.printf("%s é comendo",nome);
	}
}
