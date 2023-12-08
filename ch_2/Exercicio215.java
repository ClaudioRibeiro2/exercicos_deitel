//2.15
//Escreva um aplicativo, que solicite ao usuário inserir dois inteiros, obtenha dele esses números e 
//imprima sua soma, produto, diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
import java.util.Scanner;

public class Exercicio215{
	public static void main (String[] args){
		// Atributos
		int a;
		int b;
		int resultado;
		Scanner scanner;

		scanner = new Scanner(System.in);
		System.out.print("Insira o valor de a: ");
		a = scanner.nextInt();
		System.out.print("Insira o valor de b: ");
		b = scanner.nextInt();

		resultado = a + b;
		System.out.println("Soma de a + b = " + resultado);

		resultado = a * b;
		System.out.println("Produto de a * b = " + resultado);

		resultado = a - b;
		System.out.println("Diferença de a - b = " + resultado);

		resultado = a / b;
		System.out.println("Quociente de a / b = " + resultado);

	} // Fim do método Main
} // Fim da classe Exercicio215