package fundamentos03;
import java.util.Scanner;

public class execicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu texto: ");
		String texto = entrada.nextLine();
		entrada.close();
		String maiusculo = texto.toUpperCase();
		System.out.println(maiusculo);
	}

}
