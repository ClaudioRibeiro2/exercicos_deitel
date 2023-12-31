//Exercice 3.1 (Case Study)
/*Modifique o programa de adição na Figura 2.7 para utilizar entrada e saída baseadas em caixas de
diálogo com os métodos da classe JOptionPane. Uma vez que o método showInputDialog retorna uma 
String, você deve converter a String que o usuário insere em um int para utilização em cálculos.
O método static parseInt da classe Integer (pacote java.lang) recebe um argumento String que
representa um inteiro e retorna o valor como um int. Se a String não contiver um inteiro válido,
o programa terminará com um erro.*/

import javax.swing.JOptionPane;

public class SwingSumInteger {
	public static void main(String[] args){
		// Attributes
		String input;
		String message;
		int num1;
		int num2;
		int sum;

		message = "Welcome to this Program! Please type two integers, and the program will print "+
		          "the sum";
		JOptionPane.showMessageDialog(null, message);

		input = JOptionPane.showInputDialog("Enter the first integer.");
		num1 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog("Enter the second integer.");
		num2 = Integer.parseInt(input);

		sum = num1 + num2;

		message = String.format("The sum is %d.", sum);
		JOptionPane.showMessageDialog(null, message);
	}// End of the main method
}// End of the class