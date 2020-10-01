package JavaQuestions;

public class CountNumberOfDigit {		//WJP to count number of digits in an integer

	public static void main(String[] args) {
		
		// 1234 -- 4
		// 123 -- 3
		
		int num = 1234;
		int count = 0;
		
		while(num != 0){
			num = num/10;
			count++;
		}
		System.out.println("Number of digit = "+count);
	}

}
