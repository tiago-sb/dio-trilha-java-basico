package Escola;
public class Escola {
	public static void main(String[] args) {
		Aluno primeiroAluno = new Aluno();
		
		primeiroAluno.setNome("anna");
		primeiroAluno.setIdade(10);
		primeiroAluno.setAltura(1.53f);
		System.out.println("Nome: " + primeiroAluno.getNome() + "\nIdade: " + primeiroAluno.getIdade());
		System.out.println("altura: " + primeiroAluno.getAltura());
	}
}
/* não posso usar esta atribuição, uma vez que os atributos são private
 * primeiroAluno.nome = "Tiago";
 * primeiroAluno.idade = 14;
 */
