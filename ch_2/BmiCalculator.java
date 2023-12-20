//Exercice 2.33 (Calculadora de indice de massa corporal)
//Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício 1.10. As fórmulas 
//para calcular o IMC = kilogramas / alturaMetros²
//Crie um aplicativo de calculadora IMC que leia o peso do usuário em kilogramas e a altura em
//metros e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exibe as 
//seguintes informações do Departament of Health and Human Services/National Institutes of 
//Health, assim o usuário pode avaliar o seu IMC.

import java.util.Scanner;

public class BmiCalculator {
	public static void main(String[] args){
		//Attributes
		int weigth;
		double heigth;
		double bmi;
		Scanner scanner;

		scanner = new Scanner(System.in);
		System.out.println("Welcome! This program reads the weigth (kilogram) and the heigth " +
						   "(meters), and calculates the BMI (Body Mass Index). After that " +
						   "he displays your weight in the appropriate category.\n");

		System.out.print("Enter a weigth in kilograms: ");
		weigth = scanner.nextInt();

		System.out.print("Enter a heigth in meters: ");
		heigth = scanner.nextDouble();

		System.out.println("\nCalculating your BMI...");
		bmi = weigth / (heigth * heigth);

		if (bmi < 18.5) {
			System.out.printf("You BMI is: %.2f, you are underweigth.\n", bmi);
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.printf("You BMI is: %.2f, you are normal weigth.\n", bmi);
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.printf("You BMI is: %.2f, you are overweigth.\n", bmi);
		} else if (bmi >= 30) {
			System.out.printf("You BMI is: %.2f, you are obese.\n", bmi);
		}
	}// End of main method
} // End of the class BmiCalculator