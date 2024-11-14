	package fundamentos;
	import java.util.Scanner;
	
	public class maior {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner numero = new Scanner (System.in);
			System.out.print("Diga o 1º número: ");
			double n1 = numero.nextDouble();
			System.out.print("Diga o 2º número: ");
			double n2 = numero.nextDouble();
			System.out.print("Diga o 3º número: ");
			double n3 = numero.nextDouble();
			if (n2<n1 && n3<n1) {
				System.out.print(n1+" é o maior");
			} else  if (n1<n2 && n3<n2) {
				System.out.print(n2+" é o maior");
			} else {
				System.out.print(n3+" é o maior");
			}
			
	}
}