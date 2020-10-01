package JavaQuestions;

public class CheckPrimeNumber {			//WJP to check whether number can be expressed as sum of two prime number

	public static void main(String[] args) {
	
		//34 = 3+31 5+29 11+23 17+17
		//11
		int num = 34;
		boolean flag = false;
		
		for(int i=2; i<=num/2; i++){
			
			if(CheckPrimeNumber(i)){
				
				if(CheckPrimeNumber(num-i)){
					System.out.println(num+" = "+ i +" + "+(num-i));
					flag = true;
				}
			}
		}

	}

	public static boolean CheckPrimeNumber(int num){
		boolean isPrime = true;
		
		for(int i=2; i<= num/2; i++){
			if(num % i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
