package JavaQuestions;

public class OctalToDecimal {

	public static void main(String[] args) {

		System.out.println(convertOctalToDecimal(65));

	}

	public static int convertOctalToDecimal(int octalNum){
		
		int decimalNum = 0;
		int i = 0;
		
		while(octalNum != 0){
			
			decimalNum += (octalNum % 10) * Math.pow(8, i);
			i++;
			octalNum /= 10;
			
		}
		return decimalNum;
	}
}
