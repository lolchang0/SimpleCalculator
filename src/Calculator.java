import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double input1, input2, result;
		
		System.out.println("Welcome to my Calculator Program!");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.print("Please select a function: ");

		char choice = scan.next().charAt(0);
		
		while (choice != '5') {
			switch(choice) {
				case '1':
					System.out.println("\nPlease input two numbers.");
					System.out.print("Input 1: ");
					input1 = scan.nextDouble();
					System.out.print("Input 2: ");
					input2 = scan.nextDouble();
					result = input1 + input2;
					System.out.println(input1 + " + " + input2 + " = " + result + "\n");
					break;
				case '2':
					System.out.println("\nPlease input two numbers.");
					System.out.print("Input 1: ");
					input1 = scan.nextDouble();
					System.out.print("Input 2: ");
					input2 = scan.nextDouble();
					result = input1 - input2;
					System.out.println(input1 + " - " + input2 + " = " + result + "\n");
					break;
				case '3':
					System.out.println("\nPlease input two numbers.");
					System.out.print("Input 1: ");
					input1 = scan.nextDouble();
					System.out.print("Input 2: ");
					input2 = scan.nextDouble();
					result = input1 * input2;
					System.out.println(input1 + " x " + input2 + " = " + result + "\n");
					break;
				case '4':
					System.out.println("\nPlease input two numbers.");
					System.out.print("Input 1: ");
					input1 = scan.nextDouble();
					System.out.print("Input 2: ");
					input2 = scan.nextDouble();
					result = input1 / input2;
					System.out.println(input1 + " / " + input2 + " = " + result + "\n");
					break;
				default: 
					System.out.println("Invalid Option\n");
					break;
			}
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Please select a function: ");

			choice = scan.next().charAt(0);
		}
		
		System.out.println("You have successfully exited the program. Thank you!");
	}
}