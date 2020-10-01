package JavaQuestions;

public class NaturalNumberSum {			//WJP to calculate sum of natural numbers

	public static void main(String[] args) {
	
		int num = 100;
		int sum = 0;
		
		// 1+2+3+4+.....+100
		// 1st method
		for(int i=1; i<=num; i++){
			sum = sum + i;
		}
		System.out.println("Sum of numbers = "+sum);
		
		System.out.println("------------");
		//2nd method
		int s = 0;
		int k = 1;
		
		while(k<=num){
			s = s + k;
			k++;
		}
		System.out.println("Sum of numbers = "+s);
	}

}
