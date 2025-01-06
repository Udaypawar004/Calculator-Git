import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator.");
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();

		System.out.println("Choose an option");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		double result;
		int option = sc.nextInt();
		switch(option){
			case 1: result=addition(num1, num2);
			        System.out.println("The addition is:" + result);
			        break;
			case 2: result= subtraction(num1, num2);
			        System.out.println("The Subtraction is: " + result);
			        break;
			case 3: result= multiplication(num1, num2);
			        System.out.println("The multiplication is: " + result);
			        break;
			default: System.out.println("Invalid option.");
		}
		sc.close();
	}

	public static double addition(double num1, double num2) {
		return num1 + num2;
	}
	public static double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	public static double multiplication(double num1, double num2){
	  return num1 * num2;
	}
}
