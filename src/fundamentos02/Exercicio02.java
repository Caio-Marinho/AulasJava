package fundamentos02;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		float soma = 0;
		int cont = 1;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe  o numero de alunos: ");
		int qtd_alunos = entrada.nextInt();
		while (cont<=qtd_alunos) {
			System.out.printf("Informe a  nota  do %dº aluno: ",cont);
			float nota = entrada.nextFloat();
			cont++;
			soma+=nota;
		}
		float media = soma/qtd_alunos;
		System.out.printf("A média da turma foi %.2f",media);
		entrada.close();
	}
}
