import java.util.Scanner;
import java.util.Locale;
public class ResultadoEscolar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("insira sua nota: ");
		float nota = entrada.nextFloat();
		if(nota >= 7) {
			System.out.println("aprovado(a)!");
		} else if((nota >= 4)&&(nota < 7)){
			System.out.println("recuperacao!");
		} else {
			System.out.println("reprovado(a)!");
		}
		entrada.close();
	}
}
