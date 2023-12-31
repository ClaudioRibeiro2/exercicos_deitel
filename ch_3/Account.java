/*Exercice 3.11
Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que retira
dinheiro de uma Account. Assegure que o valor do débito não exceda o saldo de Account. Se exceder,
o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que indica "Withdrawal 
amount exceeded account balance". Modifique a classe AccountTest (Figura 3.9) para testar o método
withdraw.*/

public class Account {
	// Attibutes
	private String name;
	private double balance;

	// Constructor
	public Account(String name, double initialBalance){
		this.name = name;

		// Validation, if the comes a negative number, it will not add to the balance.
		if (initialBalance > 0.0){
			this.balance = initialBalance;
		}
	}

	// Methods
	public void deposit(double depositAmount){
		// Validation
		if (depositAmount > 0.0){
			balance = balance + depositAmount;
		}
	}

	public void withdraw(double withdrawAmount){
		// Validation
		if (withdrawAmount > 0.0){
			if (withdrawAmount <= balance){
				System.out.printf("Withdrawing R$ %.2f...%n", withdrawAmount);
				balance = balance - withdrawAmount;
			} else {
				System.out.println("Withdrawal amount exceeded account balance");
			}
		}
	}

	// Setter & Getter
	public void setName(String newName){
		this.name = newName; // Stores the name
	}
	public String getName(){
		return this.name; // Get the name stored
	}

	public double getBalance(){
		return this.balance;
	}
}// End of the class Account