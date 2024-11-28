package fundamentos03;

public class exercicio05 {
	public static void main(String[] args) {
		String array[] = {"a","vida","é","bela"},texto=new String (),espaco=" ";
		for (int i=0;i<array.length;i++) {
			texto+=array[i]+espaco;
		}
		System.out.println(texto.trim().toUpperCase());
	}
}
