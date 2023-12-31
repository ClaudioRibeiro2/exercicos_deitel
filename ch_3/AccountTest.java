/*Exercice 3.11
Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que retira
dinheiro de uma Account. Assegure que o valor do débito não exceda o saldo de Account. Se exceder,
o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que indica "Withdrawal 
amount exceeded account balance". Modifique a classe AccountTest (Figura 3.9) para testar o método
withdraw.*/

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		// Attributes
		Scanner scanner = new Scanner(System.in);;
		Account account1 = new Account("Fulano", 68.50);
		Account account2 = new Account("Ciclano", -17.56);
		double depositAmount;
		double withdrawAmount;

		System.out.println("Welcome! This program creates two accounts, and enables you to deposit"+
						   "or withdraw from this accounts.");

		// Showing the balance of the accounts
		System.out.printf("%n%s balance: R$ %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: R$ %.2f%n", account2.getName(), account2.getBalance());

		// Depositing in account1
		System.out.print("Enter a deposit amount for account1: R$ ");
		depositAmount = scanner.nextDouble();
		System.out.printf("%nAdding R$ %.2f to account1 balance...%n%n", depositAmount);
		account1.deposit(depositAmount);
		// Depositing in account2
		System.out.print("Enter a deposit amount for account2: R$ ");
		depositAmount = scanner.nextDouble();
		System.out.printf("%nAdding R$ %.2f to account2 balance...%n%n", depositAmount);
		account2.deposit(depositAmount);

		// Showing the balance of the accounts
		System.out.printf("%n%s balance: R$ %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: R$ %.2f%n", account2.getName(), account2.getBalance());

		// Withdrawing of account1
		System.out.print("Enter a withdraw amount for account1: R$ ");
		withdrawAmount = scanner.nextDouble();
		System.out.printf("%nWithdraw R$ %.2f of the account1 balance...%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		// Withdrawing of account2
		System.out.print("Enter a withdraw amount for account2: R$ ");
		withdrawAmount = scanner.nextDouble();
		System.out.printf("%nWithdraw R$ %.2f of the account2 balance...%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);

		// Showing the balance of the accounts
		System.out.printf("%n%s balance: R$ %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: R$ %.2f%n", account2.getName(), account2.getBalance());
	} // End of the main method
} // End of the AccountTest class