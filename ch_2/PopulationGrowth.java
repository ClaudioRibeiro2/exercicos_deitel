//Exercice 2.34 (Calculadora de crescimento demográfico mundial)
//Ultilize a internet para descobrir a população mundial atual e a taxa de crecimento
//demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, que 
//exiba a população mundial estimada depois de um, dois, três, quatro, cinco anos.

public class PopulationGrowth {
	public static void main (String[] args){
		long globalPopulation = 8045311447L;
		double rateGrowth = 0.88;
		double annualIncrease = globalPopulation / 100 * rateGrowth;
		System.out.println("Welcome, This program displays the size of the world's population " +
						   "and the rate of demographic growth in 2023. And predicts the\n"+
						   "growth of the population in five years!");
		System.out.println("This information has been retired from the website "+
						   "en.wikipedia.org/wiki/World_population.\n");
		System.out.printf("Global Population in 2023 = %,d people.%n", globalPopulation);
		System.out.printf("Rate of demographic growth = %.2f%% per year.%n%n", rateGrowth);;

		System.out.println("Predictions in five years:");
		System.out.printf("Global Population in 2024 = %,d people.%n",  globalPopulation += annualIncrease);
		System.out.printf("Global Population in 2025 = %,d people.%n", globalPopulation += annualIncrease);
		System.out.printf("Global Population in 2026 = %,d people.%n", globalPopulation += annualIncrease);
		System.out.printf("Global Population in 2027 = %,d people.%n", globalPopulation += annualIncrease);
		System.out.printf("Global Population in 2028 = %,d people.%n", globalPopulation += annualIncrease);
		//The results are a little innacurrate, because of the multiplication of a double. 
	}// End of the main method
}// End of the class PopulationGrowth