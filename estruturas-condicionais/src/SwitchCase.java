import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("insira o tamanho da camisa [P, M, G]: ");
		char tamanhoCamisa = entrada.next().charAt(0);
		tamanhoCamisa = Character.toUpperCase(tamanhoCamisa);
		switch(tamanhoCamisa) {
			case 'M': {
				System.out.println("medio");
				break;
			}
			case 'P': {
				System.out.println("pequeno");
				break;
			}
			case 'G': {
				System.out.println("grande");
				break;
			}
			default: {
				System.out.println("indefinido");
			}
		}
		entrada.close();
	}
}
