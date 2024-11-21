package fundamentos02;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int cont = 1, qtd_alunos;
		float media,nota=0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe  o numero de alunos: ");
		qtd_alunos = entrada.nextInt();
		while (cont<=qtd_alunos) {
			System.out.printf("Informe a  nota  do %dº aluno: ",cont);
			nota += entrada.nextFloat();
			cont++;
		}
		media = nota/qtd_alunos;
		System.out.printf("A média da turma foi %.2f",media);
		entrada.close();
	}
}
