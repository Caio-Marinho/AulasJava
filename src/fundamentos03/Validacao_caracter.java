package fundamentos03;

public class Validacao_caracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = "CDD - Java";
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD", 1));
	}

}
