package basic;

import java.util.Scanner;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		
		System.out.println("Enter the elements in the array: ");
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		int smallest = num[0];
		for(int i = 1; i < num.length; i++) {
			if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println("The smallest number in the array: " + smallest);
		
		scan.close();
	}

}
