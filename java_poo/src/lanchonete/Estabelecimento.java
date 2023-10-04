package lanchonete;

import lanchonete.cozinha.*;
import lanchonete.clientes.Cliente;
import lanchonete.atendimento.Atendente;
public class Estabelecimento {
	public static void main(String[] args) {	
		Cozinheiro cozinheiro = new Cozinheiro();
		Almoxarife almoxarife = new Almoxarife();
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		
	}
}
