import java.util.Scanner;
public class ResultadoEscolar_Ternario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("insira sua nota: ");
		float nota = entrada.nextFloat();
		//simples
		System.out.println(nota >= 7 ? "aprovado" : "reprovado");
		//verboso
		System.out.println(nota >= 7 ? "aprovado!" : nota >= 4 && nota < 7 ? "recuperacao!" : "reprovado!");
		entrada.close();
	}
}
