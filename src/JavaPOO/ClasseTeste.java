package JavaPOO;
import java.util.Scanner;

public class ClasseTeste {
	public static void main(String[] args) {
		ClassePessoa aluno = new ClassePessoa();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		aluno.nome = entrada.nextLine();
		System.out.print("Informe seu Sobrenonome: ");
		aluno.sobrenome = entrada.nextLine();
		entrada.close();
		aluno.comer();
	}
}
