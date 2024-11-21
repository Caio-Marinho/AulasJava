package fundamentos02;
import java.util.Scanner;

public class Impares {
	public static void main(String[] args) {
		int numero_fim,numero=1;
		Scanner numero_max = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero_fim = numero_max.nextInt();
		numero_max.close();
		while(numero<=numero_fim) {
			if (numero % 2 == 1) {
				System.out.println(numero);
			}
			numero++;
		}
	}
}
