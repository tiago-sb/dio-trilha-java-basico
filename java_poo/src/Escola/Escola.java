package Escola;
public class Escola {
	public static void main(String[] args) {
		Aluno primeiroAluno = new Aluno("tiago","123");
		
		primeiroAluno.setIdade(19);
		primeiroAluno.setAltura(1.78f);
		
		System.out.println("Nome: " + primeiroAluno.getNome() + "\nIdade: " + primeiroAluno.getIdade());
		System.out.println("altura: " + primeiroAluno.getAltura() + "\nCpf: " + primeiroAluno.getCpf());
	}
}
/* não posso usar esta atribuição, uma vez que os atributos são private
 * primeiroAluno.nome = "Tiago";
 * primeiroAluno.idade = 14;
 */
