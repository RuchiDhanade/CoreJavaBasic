package JavaQuestions;

public class DecimalToBinary {

	public static void main(String[] args) {

		int num = 156;
		long binary = convertDecimalToBinary(num);
		System.out.println(binary);

	}

	public static long convertDecimalToBinary(int num){
		
		long binaryNum = 0;
		int remainder = 1;
		int i = 1;
		
		while(num != 0){
			
			remainder = num % 2;
			num = num/2;
			binaryNum += remainder * i;
			i *= 10;
		}
		return binaryNum;
	}
}
