//Exercice 2.32 (Valores negativos, positivos e zero)
//Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
//quantos positivos e quantos zeros foram inseridos.

import java.util.Scanner;

public class PositiveNegativeZeroInteger {
	public static void main(String[] args){
		// Attributes
		int a;

		Scanner scanner;
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;

		scanner = new Scanner(System.in);
		System.out.println("Welcome! This program reads five integers, and displays which is" +
					       " positive, positive or zero.\n");

		for (int i = 0; i < 5; i ++){
			System.out.print("Please, enter an integer: ");
			a = scanner.nextInt();
			if (a == 0){
				countZero++;
			}else if (a < 0){
				countNegative++;
			}else if (a > 0){
				countPositive++;
			}
		}

		System.out.println("\nCounting...\n");
		System.out.printf("Amount of positive integers: %d%n"+
						  "Amount of negative integers: %d%n"+
						  "Amount of zero integers: %d%n%n",
						   countPositive, countNegative, countZero);
	} // End of the main method
} // End of the class PositiveNegativeZeroInteger