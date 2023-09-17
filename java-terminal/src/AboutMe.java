import java.util.Scanner;
import java.util.Locale;
public class AboutMe {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		//nome
		System.out.print("seu nome: ");
		String nome = entrada.nextLine();
		//sobrenome
		System.out.print("seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		//idade
		System.out.print("sua idade: ");
		int idade = entrada.nextInt();
		//altura
		System.out.print("sua altura: ");
		double altura = entrada.nextDouble();
		//prints
		System.out.println("Me chamo " + nome + " " + sobrenome);
		System.out.print("tenho " + idade + " anos ");
		System.out.print("e " + altura + "m de altura");
		entrada.close();
	}
}
