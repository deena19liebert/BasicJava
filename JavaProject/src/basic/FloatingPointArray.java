package basic;

import java.util.Scanner;

public class FloatingPointArray {

	public static void main(String[] args) {
		
		float[] numbers = new float[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the floating point number: ");
			numbers[i] = scan.nextFloat();
		}
		System.out.println("The numbers you entered are: ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
