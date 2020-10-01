package JavaQuestions;

public class PallindromNumber {			//WJP to check whether the number is pallindrom or not

	public static void main(String[] args) {
		
		int num = 121;
		int rev = 0;
		int n = 0;
		int actualNum = num;
		
		while(num != 0){
			n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		System.out.println(rev);
		
		if(actualNum == rev){
			System.out.println(actualNum+" is a pallindrom number");
		}
		else{
			System.out.println(actualNum+" is not pallindrom number");
		}
	}

}
