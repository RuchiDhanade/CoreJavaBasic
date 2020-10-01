package JavaQuestions;

import java.util.Scanner;

public class PrintIntegers {		//WAP to print an integer (enter by user)

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int num = reader.nextInt();
		
		System.out.println("You entered = "+num);
	}

}
