package JavaPOO;
import java.util.Scanner;

public class ClasseTeste {
	public static void main(String[] args) {
		ClassePessoa aluno1 = new ClassePessoa();
		ClassePessoa aluno2 = new ClassePessoa();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o nome do aluno 1: ");
		aluno1.nome = entrada.nextLine();
		System.out.print("Informe o Sobrenonome do aluno 1: ");
		aluno1.sobrenome = entrada.nextLine();
		System.out.print("Informe o nome do aluno 2: ");
		aluno2.nome = entrada.nextLine();
		System.out.print("Informe o Sobrenonome do aluno 2: ");
		aluno2.sobrenome = entrada.nextLine();
		entrada.close();
		aluno1.comer();
		aluno2.comer();
	}
}