//Exercice 2.30 (Separando os dígitos em um inteiro)
//Escreva um aplicativo que insira um número consistindo em cinco digitos a partir do usuário,
//separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por
//três espaçaços. Verificar se o número tem mais de 5 digitos.

import java.util.Scanner;

public class DetachInteger {
	public static void main (String[] args){
		// Attributes
		int a;
		Scanner scanner;
		boolean isFiveDigits;

		scanner = new Scanner(System.in);

		System.out.println("Welcome! This program reads an integer with five digits and displays"
						 + " them separated by a blank space.\n");

		isFiveDigits = false;
		while (isFiveDigits == false) {
			System.out.print("Please enter an integer with five digits: ");
			a = scanner.nextInt();

			if (a / 10000 >= 1 && a / 10000 < 10){
				isFiveDigits = true;
				System.out.printf("%nDetaching the integer...%n%d   %d   %d   %d   %d%n",
								  (a / 10000),
							      (a / 1000) % 10,
							      (a / 100) % 10,
							      (a / 10) % 10,
							      (a % 10));
			} else {
				System.out.println("\nThe integer does not have 5 digits.");
			}
		}
		scanner.close();
	} // End of the main method
} // End of the class DetachInteger