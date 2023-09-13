public class Operadores {
	public static void main(String[] args) {
		int numero = 5;
		System.out.println(numero);
		numero = -numero;
		System.out.println(numero);
		numero = +numero;
		System.out.println(numero);
		numero = -numero;
		System.out.println(numero);
		//***********************
		int numero1 = 1;
		numero1++; // numero1 = numero1 + 1 == numero1 += 1 
		System.out.println(numero1);
		//***********************
		int a = 45;
		int b = 46;
		String resultado = a != b ? "verdade" : "falacia";
		System.out.println(resultado);
		String nome = "tiago";
		String nome2 = new String("tiago");
		System.out.println(nome.equals(nome2) ? "iguais" : "diferentes"); // faz a comparação entre objetos
		if(5+2+1 <= 7 && 10 == 10) {
			System.out.println("ok");
		}
	}
}
