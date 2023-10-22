package conceitos_iniciais;
public class Carro {
	// atributos
	public boolean ligado = false;
	private String marca;
	private int anoCriacao;
	// construtores
	public Carro(String marca, int anoCriacao) {
		this.marca = marca;
		this.anoCriacao = anoCriacao;
	}
	public Carro() {}
	// get e set
	public String getMarca() {
		return this.marca;
	}
	public int getAnoCriacao() {
		return this.anoCriacao;
	}
	public void ligarCarro() {
		confereCombustivel();
		confereCambio();
		this.ligado = true;
		
	}
	private void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
	private void confereCambio() {
		System.out.println("conferindo cambio");
	}
}	
