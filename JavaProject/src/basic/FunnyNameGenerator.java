package basic;

import java.util.HashMap;
import java.util.Scanner;

public class FunnyNameGenerator {

	public static void main(String[] args) {
		
		System.out.println("Enter the date of your birthday: ");
		Scanner scan = new Scanner(System.in);
		int date = scan.nextInt();
		System.out.println("Enter the month of your birthday: ");
		String month = scan.next();
		
		HashMap<Integer, String> dates = new HashMap<Integer, String>();
		dates.put(1, "Billy");
		dates.put(2, "Bore");
		dates.put(3, "Bug");
		dates.put(4, "Bum");
		dates.put(5, "Ding");
		dates.put(6, "Fuzz");
		dates.put(7, "Goo");
		dates.put(8, "Gum");
		dates.put(9, "Hick");
		dates.put(10, "Pee");
		dates.put(11, "Shoo");
		dates.put(12, "Slug");
		dates.put(13, "Sniff");
		dates.put(14, "Trash");
		dates.put(15, "Stink");
		dates.put(16, "Worm");
		dates.put(17, "Zoo");
		dates.put(18, "Fig");
		dates.put(19, "Chew");
		dates.put(20, "Beenie");
		dates.put(21, "Mad");
		dates.put(22, "Egg");
		dates.put(23, "Wee");
		dates.put(24, "Lick");
		dates.put(25, "Fart");
		dates.put(26, "Buzz");
		dates.put(27, "Fluff");
		dates.put(28, "Flap");
		dates.put(29, "Poop");
		dates.put(30, "Barf");
		dates.put(31, "Rizz");
		
		HashMap<String, String> months = new HashMap<String, String>();
		months.put("January", "bo");
		months.put("February", "buns");
		months.put("March", "kitty");
		months.put("April", "berry");
		months.put("May", "eenie");
		months.put("June", "splitz");
		months.put("July", "wee");
		months.put("August", "bag");
		months.put("September", "ster");
		months.put("October", "moo");
		months.put("November", "aloo");
		months.put("December", "pants");
		
		System.out.println("You are " + dates.get(date) + " " + months.get(month));
	}

}
