package Escola;
public class Aluno {
	// atributos do aluno 
	private String nome;
	private String cpf;
	private int idade;
	private float altura;
	
	public Aluno() {}
	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	// get e set dos atributos para poder fazer o acesso e modoficação
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float novaAltura) {
		this.altura = novaAltura;
	}
	
}
