package JavaQuestions;

public class NaturalNumberSumRecursion {	//WJP to find sum of natural number using recursion

	public static void main(String[] args) {
	
		int num = 20;
		int sum = addNum(num);
		System.out.println("Sum is: "+sum);

	}

	public static int addNum(int num){
		
		if(num != 0){
			return num + addNum(num - 1);
		}
		else{
			return num;
		}
	}
}
