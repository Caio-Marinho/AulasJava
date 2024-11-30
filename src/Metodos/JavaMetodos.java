package Metodos;

import java.util.Scanner;

public class JavaMetodos {
	int idade() {
		Scanner id = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = id.nextInt();
		id.close();
		return idade;
	}
	void mostraNome() {
		System.out.println("João");
	}
	double valor() {
		return 25.50;
	}
	String nome() {
		return "Caio";
	}
	boolean estado() {
		return true;
	}
}