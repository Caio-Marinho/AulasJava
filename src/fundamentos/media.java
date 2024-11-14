package fundamentos;
import java.util.Scanner;
public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nota = new Scanner(System.in);
		System.out.print("Digite a 1º Nota: ");
		float nota1 = nota.nextFloat();
		System.out.println("Digite a 2º Nota: ");
		float nota2 = nota.nextFloat();
		float media = (nota1+nota2)/2;
		System.out.printf("A média do estudante foi: %.2f",media);

	}

}
