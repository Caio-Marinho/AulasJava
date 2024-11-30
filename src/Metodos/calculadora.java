package Metodos;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		CalcularMetodos calcular = new CalcularMetodos();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Infome um número: ");
		int n1 = entrada.nextInt();
		System.out.print("Infome um número: ");
		int n2 = entrada.nextInt();
		System.out.print("Infome um número: ");
		int n3 = entrada.nextInt();
		entrada.close();
		int soma = calcular.somar(n1, n2,n3);
		int sub = calcular.subtrair(n1, n2, n3);
		int mult = calcular.multiplicar(n1, n2, n3);
		int divi = calcular.Division(n1, n2, n3);
		System.out.println(soma+" "+sub+" "+mult+" "+divi);
	}
}
