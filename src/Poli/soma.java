package Poli;

public class soma {
	public static void main(String[] args) {
		Operacao adicao = new Operacao();
		System.out.println(adicao.somar(1, 1));
		System.out.println(adicao.somar(1, 1.5));
		System.out.println(adicao.somar(1.5, 1));
		System.out.println(adicao.somar(1.5, 1.5));
		System.out.println(adicao.somar(1.5, 1.5, 1.5));
	}
}