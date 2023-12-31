/* Exercice 3.12 (Clase Invoice)
Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para
representar uma fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes
das informações como variáveis de instância, o número (String), a descrição (String), a quantidade
comprada de um item (int) e o preço por item (double). Sua classe deve ter um construtor que 
inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de
instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura
(isto é , multiplica a quantidade pelo preço do item) e depois retorna esse valor como double. Se
a quantidade não for positiva, ela deve ser configurada como 0. Se o preco por item não for positivo,
ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra
as capacidades da classe Invoice.*/

import java.util.Scanner;

public class InvoiceTest{
	public static void main (String[] args){
		// Attributes
		Invoice invoice1 = new Invoice("1", "RTX 4090TI", 3, 3090.30);
		Invoice invoice2 = new Invoice("2", "USB-C CHARGER", 3, 5.99);
		Invoice invoice3 = new Invoice("3", "AOC MONITOR", -1, -10.2);
		Invoice invoice4 = new Invoice("4", "IPHONE 15 PRO", 1, 4999.99);
		Invoice invoice5 = new Invoice("5", "ACER NOTEBOOK", 10, 2000.00);

		System.out.println("Welcome! This program makes several invoices, this invoices contain " +
						 "their number, a description, quantity of items and\nthe price per item.");
		System.out.println("List of invoices:");
		System.out.println("Invoice n°\tDescription\tItem Quantity\tItem Price\tInvoice Amount");
		showInvoice(invoice1);
		showInvoice(invoice2);
		showInvoice(invoice3);
		showInvoice(invoice4);
		showInvoice(invoice5);	
	} // End of the main method
	private static void showInvoice(Invoice invoice){
		System.out.printf("%s\t\t%s\t%d\t\t%.2f\t\t%.2f%n", 
						  invoice.getInvoiceNumber(),
					      invoice.getDescription(),
					      invoice.getItemQuantity(),
					      invoice.getItemPrice(),
					  	  invoice.getInvoiceAmount());
	}
}// End of the class