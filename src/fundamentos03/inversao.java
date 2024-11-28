package fundamentos03;

public class inversao {

	public static void main(String[] args) {
		String array[] = {"a","vida","é","bela"},texto=new String (),espaco=" ";
		for (int i=array.length-1;i>=0;i--) {
			texto+=array[i]+espaco;
		}
		System.out.println(texto.trim().toUpperCase());
	}
}
