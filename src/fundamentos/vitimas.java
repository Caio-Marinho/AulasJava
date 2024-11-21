package fundamentos;
import java.util.Scanner;

public class vitimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		System.out.println("Responda as perguntas: ");
		System.out.println("Telefonou para a vítima?");
		String resposta1 = entrada.nextLine();
		System.out.println("Esteve no local do crime?");
		String resposta2 = entrada.nextLine();
		System.out.println("Mora perto da vítima?");
		String resposta3 = entrada.nextLine();
		System.out.println("Devia para a vítima?");
		String resposta4 = entrada.nextLine();
		System.out.println("Já trabalhou com a vítima?");
		String resposta5 = entrada.nextLine();
		entrada.close();
		if (resposta1.equals("sim")) {
			soma++;
		}
		if (resposta2.equals("sim")) {
			soma++;
		}
		if (resposta3.equals("sim")) {
			soma++;
		}
		if (resposta4.equals("sim")) {
			soma++;
		}
		if (resposta5.equals("sim")) {
			soma++;
		}
		System.out.println(soma);
		if (soma==2) {
			System.out.println("Suspeito");
		} else if (soma>2 && soma<5) {
			System.out.println("Cúmplice");
		} else if (soma==5)  {
			System.out.println("Assasino");
		}else {
			System.out.println("Inocente");
		}

	}

}
