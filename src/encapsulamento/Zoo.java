package encapsulamento;

public class Zoo {
	public static void main(String[] args) {
		Animal bicho = new Animal();
		bicho.ajustarNome("totó");
		bicho.ajustarIdade(4);
		bicho.ajustarPorte('p');
		bicho.ajustarRaca("Viralata");
		bicho.ajustarTipo("Cachorro");
		bicho.ajustarRg("9.221.432");
		bicho.ajustarTutor("caio");
		System.out.println(bicho.texto());
	}
}
