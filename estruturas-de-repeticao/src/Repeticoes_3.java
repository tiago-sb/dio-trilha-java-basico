import java.util.concurrent.ThreadLocalRandom;
public class Repeticoes_3 {
	public static void main(String[] args) {
		double mesada = 50.0;
		while(mesada > 0) {
			double valorDoce = valorAleatorio();
			if(valorDoce > mesada) {
				valorDoce = mesada;
			}
			System.out.println("Valor do doce: " + valorDoce + " adicionando no carrinho");
			mesada -= valorDoce;
		}
		System.out.println("Mesada: " + mesada);
		System.out.println("Joao gastou toda a sua mesada em doces");
	}
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	}
}

