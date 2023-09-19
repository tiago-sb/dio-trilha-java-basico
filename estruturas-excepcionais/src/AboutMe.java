import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;
public class AboutMe {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		try {
			System.out.print("insira seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("insira seu sobrenome: ");
			String sobrenome = entrada.nextLine();
		
			System.out.print("insira sua idade: ");
			int idade = entrada.nextInt();
			
			System.out.print("insira sua altura: ");
			float altura = entrada.nextFloat();
			
			System.out.println("seu nome: " + nome + " " + sobrenome);
			System.out.println("sua idade: " + idade);
			System.out.println("sua altura: " + altura);
		} 
		catch(InputMismatchException e) {
			System.err.println("os campos idade e altura precisam ser numericos");
		}
		entrada.close();
	}
}
