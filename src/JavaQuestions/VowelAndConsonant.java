package JavaQuestions;

public class VowelAndConsonant {			//WAP to check whether alphabet is vowel or consonant

	public static void main(String[] args) {
		
		//vowel : a, e, i, o, u
		//1st method
		
		char ch = 'i';
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println(ch+ " is vowel");
		}
		else{
			System.out.println(ch+" is consonant");
		}

		//2nd method
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+ " is vowel");
			
			break;

		default:
			System.out.println(ch+" is consonant");
			break;
		}
	}

}
