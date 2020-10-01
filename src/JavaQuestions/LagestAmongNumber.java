package JavaQuestions;

public class LagestAmongNumber {			//WAP to find largest among the three numbers

	public static void main(String[] args) {
		
		 int x = 1000;
		 int y = 1000;
		 int z = 700;
		 
		 if(x>y && x>z){
			 System.out.println("x is the greatest number");
		 }
		 else if(y>z){
			 System.out.println("y is greatest number");
		 }
		 else{
			 System.out.println("z is greatest number");
		 }

		 if(x>=y){
			 if(x>=z){
				 System.out.println("x is the greatest number");
			 }
			 else{
				 System.out.println("z is the greatest number");
			 }
		 }
		 else{
			 if(y>=z){
				 System.out.println("y is the greatest number");
			 }
			 else{
				 System.out.println("z is the greatest number");
			 }
		 }
	}

}
