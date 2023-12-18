//Exercise 2.25 (Ímpar ou par)
//Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par

import java.util.Scanner;

public class OddEvenInteger {
	public static void main (String[] args){
		// Attributes
		int a;
		Scanner scanner;
		
		scanner = new Scanner(System.in);

		System.out.println("Welcome, please enter a integer. It will return even or odd");

		System.out.print("Enter the integer: ");
		a = scanner.nextInt();

		if (a % 2 == 0){
			System.out.printf("%d is even.%n", a);
		} else {
			System.out.printf("%d id odd.%n", a);
		}
	} // End of the method main
} // End of the class OddEvenInteger