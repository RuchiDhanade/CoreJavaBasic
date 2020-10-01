package JavaQuestions;

public class FactorialNumber {			//WJP to find factorial of number

	public static void main(String[] args) {
	
		int num = 5;
		int fact = 1;
		
		// !5 = 5x4x3x2x1
		// !4 = 4x3x2x1
		// !0 = 1
		
		for(int i=1; i<=num; i++){
			fact = fact * i;
		}
		System.out.println("Factorial of"+num+"is : "+fact);

	}

}
