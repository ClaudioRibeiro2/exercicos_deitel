//Exercice 2.29 (O valor inteiro de um caracter)
//Você pode determinar o equivalente em inteiro de um caractere precedendo-o com (int), como em 
//(int) 'A', Um operador dessa forma é chamado de coerção.
//Quando a instrução precedente executa, ela exibe o valor 65 (do conjunto de caracteres 
//Unicode) como parte da string.
//Utilizando instruções semelhantes àquela mostrada anteriormente neste exercício, escreva um 
//aplicativo que exiba os equivalentes inteiros de algumas letras maiúsculas, minúsculas, 
//dígitos e símbolos especiais. Mostre os equivalentes inteiros do seguinte: A B C a b c 0 1 2 $ 
//* + / e o caractere em branco

public class UnicodeValue {
	public static void main(String[] args) {
		System.out.println("Welcome! This program displays the Unicode value of a character.\n");

		System.out.printf("The character %c has the Unicode value of %d.%n", 'A', (int) 'A');
		System.out.printf("The character %c has the Unicode value of %d.%n", 'B', (int) 'B');
		System.out.printf("The character %c has the Unicode value of %d.%n", 'C', (int) 'C');
		System.out.printf("The character %c has the Unicode value of %d.%n", 'a', (int) 'a');
		System.out.printf("The character %c has the Unicode value of %d.%n", 'b', (int) 'b');		
		System.out.printf("The character %c has the Unicode value of %d.%n", 'c', (int) 'c');
		System.out.printf("The character %c has the Unicode value of %d.%n", '0', (int) '0');
		System.out.printf("The character %c has the Unicode value of %d.%n", '1', (int) '1');		
		System.out.printf("The character %c has the Unicode value of %d.%n", '2', (int) '2');
		System.out.printf("The character %c has the Unicode value of %d.%n", '$', (int) '$');		
		System.out.printf("The character %c has the Unicode value of %d.%n", '*', (int) '*');		
		System.out.printf("The character %c has the Unicode value of %d.%n", '+', (int) '+');		
		System.out.printf("The character %c has the Unicode value of %d.%n", '/', (int) '/');		
		System.out.printf("The character %c has the Unicode value of %d.%n", ' ', (int) ' ');
	} // End of the main method
} // End of the class UnicodeValue