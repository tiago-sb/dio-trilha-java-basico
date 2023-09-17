import java.util.Scanner;
import java.util.Locale;
public class Controle_de_fluxo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// sistema de saque de dinheiro
		System.out.print("Insira seu saldo: ");
		double saldo = entrada.nextDouble();
		System.out.print("Insira o valor para o saque: ");
		double valorSolicitado = entrada.nextDouble();
		if(saldo > valorSolicitado){
			saldo -= valorSolicitado;
			System.out.println("seu saldo atual: " + saldo);
		} else {
			System.out.println("saque indisponivel, saldo menor que o valor solicitado");
		}
		
		entrada.close();
	}
}
