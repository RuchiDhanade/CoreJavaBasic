package JavaQuestions;

public class FactorialRecursion {		//WJP to find factorial of number using recursion

	public static void main(String[] args) {
		
		int num = 5;
		int fact = multiplyNum(num);
		System.out.println(fact);

	}

	public static int multiplyNum(int num){
		
		 if(num>=1){
			 return num * multiplyNum(num - 1);
		 }
		 else{
			 return 1;
		 }
	}
}
