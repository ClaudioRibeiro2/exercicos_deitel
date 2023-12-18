import java.util.Scanner;

class SumInteger {
    // Main method
    public static void main(String[] args) {
        // Attributes
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum; // Bad programming practice
			
        System.out.println("Hello! Please enter the first int: ");
        num1 = scanner.nextInt();

        System.out.println("Enter the second int: ");
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.printf("The sum is %d%n", sum);
        scanner.close();
    } // End of the main method
} // End of the class Adicao