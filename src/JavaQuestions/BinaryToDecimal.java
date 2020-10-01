package JavaQuestions;

public class BinaryToDecimal {

	public static void main(String[] args) {
	
		long num = 1001100111;
		int decimal = convertBinaryToDecimal(num);
		System.out.println(decimal);

	}

	public static int convertBinaryToDecimal(long num){
		
		int decimalNum = 0;
		int i = 0;
		long remainder;
		
		while(num != 0){
			
			remainder = num % 10;
			num = num/10;
			decimalNum += remainder * Math.pow(2, i);
			i++;
		}
		return decimalNum;
	}
}
