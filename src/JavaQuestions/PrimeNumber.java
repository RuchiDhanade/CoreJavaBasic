package JavaQuestions;

public class PrimeNumber {			//WJP to check whether number is prime or not

	public static void main(String[] args) {
		
		// divisible by itself or 1.
		// 2 is the lowest prime number in positive number
		
		int num = 37;
		boolean flag = false;
		
		for(int i=2; i<=num/2; i++){
			
			if(num % i == 0){
				flag = true;
				break;
			}
		}

		if(!flag){
			System.out.println(num+" is a prime number");
		}
		else{
			System.out.println(num+" is not a prime number");
		}
	}

}
