package basic;

import java.util.Scanner;

public class DisplayOddIntegers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[10];
		System.out.println("Enter the number of elements in the array: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		System.out.println("The Array is: ");
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("The odd numbers in the array are: ");
		for(int num : numbers) {
			if(num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		scan.close();
	}

}
