//Exercice 2.24 (Inteiro maiores e menores)
//Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
//no grupo. Utilize somente técnicas de programação que você aprendeu neste capítulo. 

import java.util.Scanner;

public class BiggerSmallerInteger {
	public static void main (String[] args){
		// Atributos
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		Scanner scanner;

		scanner = new Scanner(System.in);

		System.out.println("Welcome! This program receives five integers,"+
						" and returns the bigger and smaller of the five.\n");

		System.out.print("Please, enter the first integer:  ");
		num1 = scanner.nextInt();

		System.out.print("Please, enter the second integer: ");
		num2 = scanner.nextInt();

		System.out.print("Please, enter the third integer:  ");
		num3 = scanner.nextInt();

		System.out.print("Please, enter the forth integer:  ");
		num4 = scanner.nextInt();

		System.out.print("Please, enter the fifth integer:  ");
		num5 = scanner.nextInt();		

		System.out.println();
		

		// Checking if all the numbers are equal.
		if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5){
			System.out.println("All the integers are equal.");
		}

		// Checking the bigger integer
		if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5){
			System.out.printf("%d is the biggest.%n", num1);
		}else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
			System.out.printf("%d is the biggest.%n", num2);
		}else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
			System.out.printf("%d is the biggest.%n", num3);
		}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
			System.out.printf("%d is the biggest.%n", num4);
		}else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
			System.out.printf("%d is the biggest.%n", num5);
		}
		// Checking the smaller integer
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
			System.out.printf("%d is the smallest.%n", num1);
		}else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
			System.out.printf("%d is the smallest.%n", num2);
		}else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
			System.out.printf("%d is the smallest.%n", num3);
		}else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
			System.out.printf("%d is the smallest.%n", num4);
		}else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
			System.out.printf("%d is the smallest.%n", num5);
		}
	} // End of the method main
} // End of the Class BiggerSmallerInteger