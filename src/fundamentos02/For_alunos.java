package fundamentos02;
import java.util.Scanner;

public class For_alunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd_alunos;
		float nota=0,media;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe quantos alunos tem: ");
		qtd_alunos = entrada.nextInt();
		for (int i = 1;i<=qtd_alunos;i++) {
			System.out.printf("Informe a nota do %dº aluno: ",i);
			nota+= entrada.nextFloat();
		}
		media = nota/qtd_alunos;
		System.out.printf("A média da turma foi de %.2f",media);
		entrada.close();
	}

}