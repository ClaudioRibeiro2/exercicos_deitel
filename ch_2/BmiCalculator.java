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

		bmi = weigth / (heigth * heigth);
		System.out.printf("\nYour BMI is: %.2f\n", bmi);
		System.out.println("BMI VALUES\n" +
						   "Underweight: less than 18.5\n" +
						   "Normal: between 18.5 and 24.9\n" +
						   "Overweight: between 25 and 29.9\n" +
						   "Obese: 30 or greater\n");
	}// End of main method
} // End of the class BmiCalculator