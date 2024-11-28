package fundamentos03;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Contar_caracter {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu texto: ");
		String texto = entrada.nextLine();
		entrada.close();
		StringTokenizer token = new StringTokenizer(texto);
		System.out.printf("O texto '%s' tem %d Palavras",texto,token.countTokens());
	}
}