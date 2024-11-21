package fundamentos02;

public class impar_par {
	public static void main(String[] args) {
		int num =1;
		
		while(num<=100) {
			if (num%2!=0) {
				System.out.print(num+",");
			}
			num++;
		}
		num = 1;
		System.out.println();
		while(num<=100) {
			if (num%2 == 0) {
				System.out.print(num+", ");
			}
			num++;
		}
	}
}
