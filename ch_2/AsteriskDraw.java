//Exercice 2.18 (Exibindo formas com asteriscos)
//Escreva um aplicativo que exiba uma caixa, uma elipse, uma seta e um losango utilizando asteriscos
//(*), como segue

public class AsteriskDraw {
	public static void main (String[] args){
		// First Line
		draw(9, 3);
		draw(3, 5);
		draw(1, 7);
		draw(1, 4);
		breakLine();
		// Second Line
		draw(1, 7);
		draw(1, 2);
		draw(1, 3);
		draw(1, 3);
		draw(3, 5);	
		draw(1, 1);
		draw(1, 3);
		breakLine();
		// Third Line
		draw(1, 7);
		draw(1, 1);
		draw(1, 5);
		draw(1, 1);
		draw(5, 3);
		draw(1, 3);
		draw(1, 2);
		breakLine();
		// Forth Line
		draw(1, 7);
		draw(1, 1);
		draw(1, 5);
		draw(1, 3);
		draw(1, 4);
		draw(1, 5);
		draw(1, 0);
		breakLine();
		// Fifth Line
		draw(1, 7);
		draw(1, 1);
		draw(1, 5);
		draw(1, 3);
		draw(1, 3);
		draw(1, 7);
		draw(1, 0);
		breakLine();
		// Sixth Line
		draw(1, 7);
		draw(1, 1);
		draw(1, 5);
		draw(1, 3);
		draw(1, 4);
		draw(1, 5);
		draw(1, 0);
		breakLine();
		// Seventh Line
		draw(1, 7);
		draw(1, 1);
		draw(1, 5);
		draw(1, 3);
		draw(1, 5);
		draw(1, 3);
		draw(1, 0);
		breakLine();
		// Octave Line
		draw(1, 7);
		draw(1, 1);
		draw(1, 5);
		draw(1, 3);
		draw(1, 6);
		draw(1, 1);
		draw(1, 0);
		breakLine();
		// Ninth Line
		draw(9, 3);
		draw(3, 5);
		draw(1, 7);
		draw(1, 4);
		breakLine();
	} // End of the method main

	private static void draw(int asterisks, int blankSpace){
		drawAsterisk(asterisks);
		drawBlankSpace(blankSpace);
	}

	private static void drawAsterisk(int qtde){
		char asterisks = '*';
		for (int i = 0; i < qtde; i++){
			System.out.print(asterisks);
		}
	}

	private static void drawBlankSpace(int qtde){
		char blankSpace = ' ';
		for (int i = 0; i < qtde; i++){
			System.out.print(blankSpace);
		}
	}

	private static void breakLine(){
		System.out.println();
	}
} // End of the class AsteriskDraw