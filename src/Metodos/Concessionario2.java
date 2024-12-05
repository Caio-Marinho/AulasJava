package Metodos;

public class Concessionario2 {
	public static void main(String[] args) {
		Honda hondafitpreto = new Honda("2.0 flex","Honda Accord",60000);
		System.out.println(hondafitpreto.modelo);
		hondafitpreto.LigarCarro();
		hondafitpreto.DesligarCarro();
	}
}
