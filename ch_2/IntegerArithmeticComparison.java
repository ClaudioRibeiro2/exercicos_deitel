// Exercice 2.17 (Aritmética, menor e maior)
// Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto 
// e os números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo 
// da média neste exercício deve resultar em uma representação de inteiro. Assim, se a soma dos valores 
// for 7, a média deverá ser 2, não 2,3333...]

import java.util.Scanner;

public class IntegerArithmeticComparison {
	public static void main (String[] args){
		// Atributos
		int x = 0;
		int y = 0;
		int z = 0;
		boolean isInt = true;
		Scanner scanner;

		scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the value of x: ");
			x = scanner.nextInt();
			
			System.out.print("Enter the value of y: ");
			y = scanner.nextInt();

			System.out.print("Enter the value of z: ");
			z = scanner.nextInt();

		} catch (Exception e) {
			isInt = false;
			System.out.println("Number entered is not a Integer, please try again.");
		}

		if (isInt == true) {
			showArithmetic(x, y, z);
			showComparison(x, y, z);	
		}
	} // Fim do método Main
	// Métodos
	private static void showArithmetic(int x, int y, int z){
		// Soma, média, produto
		int result;
		System.out.println("Arithmetic:");

		result = x + y + z;
		System.out.printf("	%d + %d + %d = %d%n", x, y, z, result);
		result = (x + y + z) / 3;
		System.out.printf("	(%d + %d + %d) / 3 = %d%n", x, y, z, result);
		result = x * y * z;
		System.out.printf("	%d * %d * %d = %d%n", x, y, z, result);
	}

	private static void showComparison(int x, int y, int z){
		if (x == y && x == z){
			System.out.println("All integers are equals.");
		} else if (x > y && x > z){
			System.out.println("x is larger.");
		} else if (y > x && y > z){
			System.out.println("y is larger.");
		} else if (z > x && z > y){
			System.out.println("z is larger.");
		}
	}
} // Fim da classe IntegerArithmeticComparison