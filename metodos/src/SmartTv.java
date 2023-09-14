public class SmartTv {
	boolean ligada = false;
	int volume = 10;
	int canal = 1;
	public void ligarTv() {
		ligada = true;
		System.out.println("ligando tv");
	}
	public void desligarTv() {
		ligada = false;
		System.out.println("desligando tv");
	}
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	public void diminuirVolume() {
		volume--;
		System.out.println("Aumentando o volume para: " + volume);
	}
	public void aumentarDeCanal() {
		canal++;
	}
	public void diminuirDeCanal() {
		canal--;
	}
	public void mudarDeCanal(int novoCanal) {
		canal = novoCanal;
	}
}
