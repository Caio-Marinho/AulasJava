package fundamentos;
import java.util.Scanner;

public class exemplo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  entrada = new Scanner(System.in);
		// tipos de print 
		//print(printa e permanece na mesma linha)
		// println(printa e pula uma linha)
		//printf(print formatado)
		System.out.print("Digite um número: ");
		double resp = entrada.nextDouble();
		System.out.printf("%.2f",resp);

	}	

}
