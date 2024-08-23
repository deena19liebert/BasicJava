package basic;

public class BreakStatement {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40 ,50, 60};
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] ==40) {
				break;
			}
			
			System.out.println(numbers[i]);
		}
      
  }

}
