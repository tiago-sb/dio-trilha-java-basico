public class Repeticoes {
	public static void main(String[] args) {
		// trabalhando com laço for em java
		for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
			System.out.println("Carneirinho: " + carneirinhos);
		}
		System.out.println("Joao dormiu zZzzZ");
		// trabalhando com laço for e arrays em java
		String alunos[] = {"tiago", "joao", "marta", "leticia"};
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("aluno" + (i + 1) + ": " + alunos[i]);
		}
		// for / each -> Array + laço for
		// a variável alunoemQuestao recebe o valor da variável alunos  
		for(String alunoEmQuestao : alunos) {
			System.out.println("Nome do aluno: " + alunoEmQuestao);
		}
		
	}
}
