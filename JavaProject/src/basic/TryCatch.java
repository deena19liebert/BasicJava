package basic;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
		  //int[] a = null;
			int[] a = {4};
		  System.out.println(a[1]);
		} catch(NullPointerException e) {
			System.out.println("Your Array is null!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds.");
		} catch(Exception e) {
			System.out.println("Something else went wrong.");
		}
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("What's your favourite number?");
		
		
		try {
			int result = scan.nextInt();
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("Sorry, please enter a number.");
		}*/
		
		
		/*try {
			int[] a = {3,5,7};
			System.out.println(a[3]);
		}  catch(Exception e) {
			System.out.println("There's an exception in the code!");
		}*/
		

	}

}
