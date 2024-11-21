package fundamentos;
import java.util.Scanner;

public class dias_da_semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dia = new Scanner(System.in);
		System.out.print("Digite o numero do dia da semana: ");
		int numero_dia = dia.nextInt();
		if (numero_dia == 1) {
			System.out.println("Domingo");
		}else if (numero_dia==2) {
			System.out.println("Segunda-Feira");
		}else if (numero_dia==3) {
			System.out.println("Terça-Feira");
		} else if(numero_dia==4) {
			System.out.println("Quarta-Feira");
		} else if (numero_dia==5) {
			System.out.println("Quinta-Feira");
		} else if (numero_dia==6) {
			System.out.println("Sexta-Feira");
		} else if (numero_dia==7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Valor Invalido!!");
		}
		dia.close();

	}

}
