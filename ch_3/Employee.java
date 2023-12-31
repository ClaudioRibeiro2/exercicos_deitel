/*Exercice 3.13 (Classe Employee) - Sempre colocar modificador de acesso! 
Crie uma classe chamada Employee que inclua três variáveis de instância, um primeiro nome (String),
um sobrenome (String), e uma salário mensal (double). Forneça um construtor que inicializa as três
variáveis de instância. Forneça um método set e um get para cada variável de instância. Se o salário
mensal não for positivo, não configure seu valor. Escreva um aplicativo de teste chamado
EmployeeTest que demonstre as capacidades da classe Employee. Crie DOIS objetos Employee e exiba o
salário anual de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário
anual de cada Employee*/

public class Employee {
	// Attributes
	private String name;
	private String surname;
	private double monthlySalary;
	// Constructor
	public Employee(String name, String surname, double monthlySalary){
		this.name = name;
		this.surname = surname;
		this.monthlySalary = monthlySalary;
	}
	// Methods
	public void increaseWage(int proportion){
		double lastWage = getMonthlySalary();
		double newWage = lastWage + ((lastWage / 100) * proportion);
		setMonthlySalary(newWage); 
	}
	public void showEmployee(){
		System.out.printf("%s %s - R$ %.2f%n",
						  getName(),
						  getSurname(),
						  getMonthlySalary());
	}
	// Getter's & Setter's
	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name = newName;
	}

	public String getSurname(){
		return this.surname;
	}
	public void setSurname(String newSurname){
		this.surname = newSurname;
	}

	public double getMonthlySalary(){
		return this.monthlySalary;
	}
	public void setMonthlySalary(double newSalary){
		this.monthlySalary = newSalary;
	}
}// End of the class