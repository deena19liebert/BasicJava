package basic;

import java.util.Scanner;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int size = scan.nextInt();
		
		if(size < 2) {
			System.out.println("Array sould have atleast 2 elements.");
			return;
		}

	}

}
