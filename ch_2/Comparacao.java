// Um boa prática de programação, é sempre no começo de um arquivo, explicar o que ele faz.
// Comparacao.java faz uma comparação entre inteiros, usando a tomada de desição IF
import java.util.Scanner;

public class Comparacao {
	public static void main(String[] args){
		// Atributos
		Scanner inpt;
		int a;
		int b;

		// "Construtor", so que não kkkk
		inpt = new Scanner(System.in);
		System.out.println("Bem vindo ao programa de comparar Inteiro!");
		
		System.out.print("Por favor insira o primeiro inteiro a ser comparado:	");
		a = inpt.nextInt();

		System.out.print("Por favor insira o segundo inteiro a ser comparado:	");
		b = inpt.nextInt();

		if (a == b)
			System.out.println("Os dois inteiro são iguais: " + a + " == " + b);
		if (a != b)
			System.out.println("Os dois inteiro são diferentes: " + a + " != " + b);
		if (a < b)
			System.out.println("O primeiro inteiro é MENOR que o segundo: " + a + " < " + b);
		if (a > b)
			System.out.println("O primeiro inteiro é MAIOR que o segundo: " + a + " > " + b);
	} // Fim do método Main
} // Fim da classe Comparação