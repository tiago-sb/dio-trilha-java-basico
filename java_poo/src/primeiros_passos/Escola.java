package primeiros_passos;

public class Escola {
	public static void main(String[] args) {
		Estudante aluno1 = new Estudante();
		aluno1.nome = "Taina";
		aluno1.idade = 13;
		aluno1.altura = 1.59;
		System.out.println("nome aluno 1: " + aluno1.nome);
		System.out.println("idade aluno 1: " + aluno1.idade);
		System.out.println("altura aluno 1: " + aluno1.altura);
	}
	
}
