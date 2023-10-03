package lanchonete.cozinha;
import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("adicionando lanche ao nosso balcao");
	} 
	public void adicionarSucoNoBalcao() {
		System.out.println("adicionando suco ao nosso balcao");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	public void prepararLanche() {
		System.out.println("preparando lanche");
	}
	public void prepararSuco() {
		System.out.println("preparando suco");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararSuco();
	}
	public void pedirParaTrocarGas(Atendente amigo) {
		amigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
