//Exercice 2.31 (Tabela de quadrados e cubos)
//Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo
//que calcule os quadrados e cubos de 0 a 10 e imprima os valores resultantes em formato de 
//tabela.
public class SquareCube {
	public static void main (String[] args){
		int index = 0;

		System.out.println("number\t\tsquare\t\tcube");
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		index++;
		System.out.printf("%d\t\t%d\t\t%d%n", index, index * index, index * index * index);
		/* 
		for (int i = 0; i < 11; i ++){
		System.out.printf("%d\t\t%d\t\t%d%n", i, i * i, i * i * i);			
		}
		*/
	} // End of the main method
} // End of the class SquareCube