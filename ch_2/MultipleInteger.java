//Exercice 2.26 (Múltiplos)
//Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do
//segundo e imprimir o resultado.

import java.util.Scanner;

public class MultipleInteger {
	public static void main(String[] args){
		// Attributes
		int a;
		int b;
		Scanner scanner;

		scanner = new Scanner(System.in);

		System.out.println("Welcome, please enter two integers. It will return if the first" + 
						   " integer is a multiple of the second, and print their result.");

		System.out.print("Enter the first integer:  ");
		a = scanner.nextInt();

		System.out.print("Enter the second integer: ");
		b = scanner.nextInt();

		System.out.println();
		
		if (a % b == 0){
			System.out.printf("The integers are multiple: %d / %d = ", a, b);
			System.out.println(a / b);
		}else {
			System.out.println("The integers are not multiple");
		}
	} // End of the method main
} // End of the class MultipleInteger