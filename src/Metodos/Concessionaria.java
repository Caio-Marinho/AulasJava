package Metodos;

public class Concessionaria {
	public static void main(String[] args) {
		Carro prototipoCarro = new Carro();
		Carro prototipoCarro2 = new Carro("New civic",40000);
		Carro prototipoCarro3 = new Carro("Preto","Golf",38000);
		System.out.println(prototipoCarro3.cor);
	}
}
