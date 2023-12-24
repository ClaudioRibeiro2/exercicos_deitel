/*Exercise 2.35 (Calculadora de economia da faixa solidária)
Pesquise vários sites sobre faixa solidária. Crie um aplicativo que calcule o custo diário de 
dirigir, para estimar quanto dinheiro pode ser econimizado com o uso da faixa solidária, que 
também tem outras vantagens, como reduzir emissões de carbono e congestionamento de tráfego. O 
aplicativo deve introduzir as seguintes informações e exibir o custo por dia para dirigir para o 
trabalho do usuário:
a) Quilômetros totais dirigidos por dia.
b) Preço por litro de gasolina.
c) Quilômetros médios por litro.
d) Taxas de estacionamento por dia.
e) Pedágio por dia.*/

import java.util.Scanner;

public class CommutationCost{
	// I didn't find nothing when searching about "faixa solidária".
	public static void main(String[] args){
		//Attributes
		double dailyKilometers;
		double gasolinePrice;
		double avgGasolineConsumption;
		double dailyParkinglot;
		double dailyToll;
		double commutingCost;
		Scanner scanner;

		System.out.println("Welcome! This program displays the cost of commuting to work, after " +
		 				   "the user provides some information about the commuting to work.\n");

		System.out.println("Commuting information:");

		scanner = new Scanner(System.in);

		System.out.print("Inform how many kilometers you drive daily: ");
		dailyKilometers = scanner.nextDouble();

		System.out.print("Inform how cost the liter of gasoline: ");
		gasolinePrice = scanner.nextDouble();

		System.out.print("Inform the average gasoline consumption of your car (km/l): ");
		avgGasolineConsumption = scanner.nextDouble();

		System.out.print("Inform the daily price of the parking lot, if you have any: ");
		dailyParkinglot = scanner.nextDouble();

		System.out.print("Inform the daily price of the toll, if you have any: ");
		dailyToll = scanner.nextDouble();

		scanner.close();

		commutingCost = ((dailyKilometers / avgGasolineConsumption) * gasolinePrice) + dailyParkinglot + dailyToll;
		System.out.printf("%nThe daily cost from commuting to work is R$ %.2f.%n", commutingCost);
	}// End of the main method
}// End of the class CommutationCost