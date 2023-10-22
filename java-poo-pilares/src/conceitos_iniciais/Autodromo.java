package conceitos_iniciais;

public class Autodromo {

	public static void main(String[] args) {
		Carro primeiroCarro = new Carro("palio",2013);
		System.out.println("carro " + primeiroCarro.getMarca() + "\nAno de fabricacao: " + primeiroCarro.getAnoCriacao());
		System.out.println("ligado? " + primeiroCarro.ligado);
		primeiroCarro.ligarCarro();
		System.out.println("ligado? " + primeiroCarro.ligado);
	}

}
