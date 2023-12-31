// Obtains a name from the user, then displays it.

import javax.swing.JOptionPane;

public class DialogName {
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("What is your complete name");

		String message = String.format("Welcome, %s, to the Program!", name);

		JOptionPane.showMessageDialog(null, message);
	}// End of the main method
} // End of the class