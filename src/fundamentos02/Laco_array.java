package fundamentos02;
import java.util.Scanner;
import java.util.Arrays;

public class Laco_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayNum1 = new int[4];
		int [] arrayNum2 = new int[4];
		int [] arrayNum3 = new int[4];
		int [] arrayNum4 = new int[4];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0;i<arrayNum1.length;i++) {
			System.out.println("Digite um número: ");
			arrayNum1[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(arrayNum1));
		for (int i = 0;i<arrayNum2.length;i++) {
			System.out.println("Digite um número: ");
			arrayNum2[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(arrayNum2));
		for (int i = 0;i<arrayNum3.length;i++) {
			System.out.println("Digite um número: ");
			arrayNum3[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(arrayNum3));
		for (int i = 0;i<arrayNum4.length;i++) {
			System.out.println("Digite um número: ");
			arrayNum4[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(arrayNum4));
		entrada.close();
	}

}
