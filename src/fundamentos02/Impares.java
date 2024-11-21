package fundamentos02;

public class Impares {
	public static void main(String[] args) {
		int numero=1;
		while(numero<=100) {
			if (numero % 2 == 1) {
				System.out.println(numero);
			}
			numero++;
		}
	}
}
