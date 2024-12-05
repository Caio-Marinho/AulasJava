package Metodos;

public class Carro {
	public String cor;
	public double preco;
	public String modelo;
	
	public Carro() {
		
	}
	
	public Carro(String modelo,double preco) {
		this.cor = "Preto";
		this.modelo = modelo;
		this.preco =  preco;
	}
	public Carro(String cor,String modelo,double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
	public void LigarCarro(){
		System.out.println("Carro Ligado");
	}
	public void DesligarCarro(){
		System.out.println("Carro Desligado");
	}
}
