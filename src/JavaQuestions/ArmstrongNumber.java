package JavaQuestions;

public class ArmstrongNumber {			//WJP to check Armstrong number

	public static void main(String[] args) {
		
		//153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		//371
		
		int num = 153;
		int actualNum = num;
		int n = 0;
		double result = 0;
		
		while(num != 0){
			
			n = num % 10;
			result = result + Math.pow(n, 3);
			num = num/10;
		}

		if(result == actualNum){
			System.out.println(actualNum+" is an armstrong number");
		}
		else{
			System.out.println(actualNum+" is not an armstrong number");
		}
	}

}
