package JavaPOO;

public class ClasseTeste {
	public static void main(String[] args) {
		ClassePessoa aluno = new ClassePessoa();
		aluno.nome = "Caio";
		System.out.println(aluno.nome);
		aluno.comer();
	}
}
