public class App {
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		System.out.println("A tv esta: " + smartTv.ligada);
		System.out.println("Seu volume atual eh: " + smartTv.volume);
		smartTv.ligarTv(); // liga a televisão
		System.out.println("A tv esta: " + smartTv.ligada);
		smartTv.aumentarVolume(); // aumenta o volume da televisão
		System.out.println("Seu volume atual eh: " + smartTv.volume);
		smartTv.mudarDeCanal(13);
		System.out.println("Atualmente esta no canal: " + smartTv.canal);
		 
	}
}
