package JavaQuestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter two number :");
		
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		
		System.out.println("Select an operator (+, -, *, /) :");
		
		char operator = reader.next().charAt(0);
		
		double result = 0;
		
		switch (operator) {
		case '+':
			result = first + second;
			break;
			
		case '-':
			result = first - second;
			break;
			
		case '*':
			result = first * second;
			break;
			
		case '/':
			result = first / second;
			break;

		default:
			System.out.println("Please select proper operators");
			break;
		}
		System.out.println(result);

	}

}
