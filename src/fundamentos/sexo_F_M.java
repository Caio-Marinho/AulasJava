package fundamentos;
import java.util.Scanner;
public class sexo_F_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sexo = new Scanner(System.in);
		System.out.print("F - Femenino\nM - Masculino\nInforme seu sexo: ");
		char genero = sexo.next().charAt(0);
		sexo.close();
		if (genero ==  'f') {
		System.out.println("Feminino");
		} else if (genero == 'm') {
			System.out.println("Masculino");
		}else {
			System.out.println("Opção invalida!!");
		}
	}
}