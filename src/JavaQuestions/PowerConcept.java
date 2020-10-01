package JavaQuestions;

public class PowerConcept {				//WJP to calculate the power of number

	public static void main(String[] args) {
		
		//3^4 = 81
		int base = 3;
		int exponent = 4;
		
		long result = 1;
		
		while(exponent != 0){
			result *= base;
			exponent--;
		}
		System.out.println(result);
		
//		System.out.println(Math.pow(base, exponent));
	}

}
