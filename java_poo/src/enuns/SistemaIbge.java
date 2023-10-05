package enuns;

public class SistemaIbge {

	public static void main(String[] args) {
		for(EstadoBrasileiro i: EstadoBrasileiro.values()) { // for-each
			System.out.println(i.getSigla() + " - " + i.getNome() + " - " + i.getDdd());
		}
		EstadoBrasileiro bahia = EstadoBrasileiro.BAHIA;
		System.out.println(bahia.getDdd());
	}
}
