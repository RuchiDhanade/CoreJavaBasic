package JavaQuestions;

public class TableMultiplication {			//WJP to generate multiplication table

	public static void main(String[] args) {
		
		int num = 13;
		int mult = 1;
		
		for(int i=1; i<=10; i++){
			mult = num * i;
			System.out.println(num+" X "+i+" = "+mult);
		}

	}

}
