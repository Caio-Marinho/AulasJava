package fundamentos;
import java.util.Scanner;
public class positivo_negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double respos = entrada.nextDouble();
		entrada.close();
		if (respos == 0) {
			System.out.println("O valor é 0");
		}else if (respos > 0){
			System.out.println(respos+" é maior que 0 sendo Positivo");
		}else {
			System.out.println(respos+" é menor que 0 sendo Negativo");
		}

	}

}
