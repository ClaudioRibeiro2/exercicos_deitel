//Exercice 2.16 (Comparando Inteiros)
//Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e
//exiba o número maior seguido pelas pelavras "is larger". Se os números forem iguais, imprima a
//mensagem "These numbers are equal". Utilize as técnicas mostrada na Figura 2.15

import java.util.Scanner;

public class ComparisonInteger {
	public static void main (String[] args){
		// Attributes
		int a;
		int b;
		Scanner scanner;

		scanner = new Scanner(System.in);

		System.out.print("Insira o valor de a: ");
		a = scanner.nextInt();
		System.out.print("Insira o valor de b: ");
		b = scanner.nextInt();

		if (a > b){
			System.out.printf("%d is larger.%n", a);
		} else if (b > a) {
			System.out.printf("%d is larger.%n", b);
		} else {
			System.out.println("These numbers are equal");
		}
	} // Fim do método Main
} // Fim da classe IntegerComparison