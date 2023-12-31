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

public class Invoice {
	// Attributes
	private String invoiceNumber;
	private String description;
	private int itemQuantity;
	private double itemPrice;

	// Constructor
	public Invoice(String invoiceNumber, String description, int itemQuantity, double itemPrice){
		this.invoiceNumber = invoiceNumber;
		this.description = description;
		// Validation
		if (itemQuantity >= 0){
			this.itemQuantity = itemQuantity;		
		} else {
			this.itemQuantity = 0;
		}
		// Validation
		if (itemPrice > 0.0){
			this.itemPrice = itemPrice;
		} else {
			this.itemPrice = 0.0;
		}
	}

	// Methods
	public double getInvoiceAmount(){
		return getItemQuantity() * getItemPrice();
	}

	// Getter's e Setter's
	public String getInvoiceNumber(){
		return this.invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber){
		this.invoiceNumber = invoiceNumber;
	}

	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public int getItemQuantity(){
		return this.itemQuantity;
	}
	public void setItemQuantity(int itemQuantity){
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice(){
		return this.itemPrice;
	}
	public void setItemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}
} // Ent of the class