package JavaQuestions;

public class ReverseANumber {			//WJP to reverse a number

	public static void main(String[] args) {
	
		int num = 1234;
		int rev = 0;
		int n = 0;
		
		while(num != 0){
			n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		System.out.println("Reverse number is : "+rev);
	}

}
