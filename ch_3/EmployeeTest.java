/*Exercice 3.13 (Classe Employee) - Sempre colocar modificador de acesso! 
Crie uma classe chamada Employee que inclua três variáveis de instância, um primeiro nome (String),
um sobrenome (String), e uma salário mensal (double). Forneça um construtor que inicializa as três
variáveis de instância. Forneça um método set e um get para cada variável de instância. Se o salário
mensal não for positivo, não configure seu valor. Escreva um aplicativo de teste chamado
EmployeeTest que demonstre as capacidades da classe Employee. Crie DOIS objetos Employee e exiba o
salário anual de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário
anual de cada Employee*/

public class EmployeeTest{
	public static void main(String [] args){
		// Attibutes
		Employee employee1 = new Employee("Claudio", "Conti", 1320.50);
		Employee employee2 = new Employee("Rodrigo", "Conti", 4050.29);

		System.out.println("Welcome! This program makes employees and show their names and monthly"+ 
						   " wage, you can raise their wages if want to.");

		employee1.showEmployee();
		employee2.showEmployee();

		System.out.println("Raising their wage by 10%...");

		employee1.increaseWage(10);
		employee2.increaseWage(10);

		employee1.showEmployee();
		employee2.showEmployee();
	}// End of the main method
}// End of the class