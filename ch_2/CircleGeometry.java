//Exercice 2.28 (Diamêtro, circuferência e área de um circulo)
//Eis uma prévia do que veremos mais adiante. Neste capítulo, você aprendeu sobre inteiros e o 
//tipo int. O Java também pode representar números de pontos flutuantes que contêm pontos de 
//fração decimal, como o 3,14159.
//Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um 
//inteiro e imprima o diâmetro do círculo, circunferencia e área utilizando o valor de ponto 
//flutuante 3,14159 para π. Utilize as técnicas mostradas na figura 2.7. Adote as seguintes 
//formulas (r é o raio):
//	diameter = 2 * r
//	circumference = 2 * π *r
//	area = π * (r * r)
//Não armazene os resultados de cada cálculo em uma váriavel. Em vez disso, especifique cada 
//cálculo como valor de saída em uma instrução System.out.printf. Os valores produzidos pelos 
//cálculos de circuferência e área são números de ponto flutuante. A saída desses valores pode 
//ser gerada com o especificador de formato %f em uma instrução System.out.printf. Você 
//aprenderá mais sobre números de ponto flutuantes no Capítulo 3.

import java.util.Scanner;

public class CircleGeometry{
	public static void main (String[] args){
		// Attibutes
		int radius;
		Scanner scanner;

		scanner = new Scanner(System.in);

		System.out.println("Welcome! This program reads an integer, which is a radius of a circle,"
		 + " and proceeds to print\nthe diameter, circumference, and area of the circle.\n");

		System.out.print("Please, enter the radius of a circle (cm): ");
		radius = scanner.nextInt();

		System.out.printf("%nPrinting the results...%n%n" +
			"CIRCLE:%n radius = %dcm%n diameter = %dcm%n circumference = %fcm%n area = %fcm%n"
			, radius
			, radius * 2
			, 2 * Math.PI * radius
			, Math.PI * (radius * radius));
	} // End of the main method
} // End of the class CircleGeometry