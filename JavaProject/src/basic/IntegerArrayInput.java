package basic;

import java.util.Scanner;

public class IntegerArrayInput {

	public static void main(String[] args) {
		 
		int[] numbers = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter an integer: ");
			numbers[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("The numbers you entered are: ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
