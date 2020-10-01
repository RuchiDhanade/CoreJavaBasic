package JavaQuestions;

public class DecimalToOctal {

	public static void main(String[] args) {
	
		int decimalNum = 109;
		System.out.println(convertDecimalToOctal(decimalNum));

	}

	public static int convertDecimalToOctal(int decimalNum){
		
		int octalNum = 0;
		int i = 1;
		int remainder = 1;
		
		while(decimalNum != 0){
			
			remainder = decimalNum % 8;
			decimalNum = decimalNum / 8;
			octalNum += remainder * i;
			i *= 10;
		}
		return octalNum;
	}
}
