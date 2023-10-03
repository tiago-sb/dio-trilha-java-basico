package lanchonete;

import lanchonete.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {	
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		
	}
}
