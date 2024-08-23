package basic;

import java.util.Random;
import java.util.Scanner;

public class EightBall {

	public static void main(String[] args) {
		System.out.println("Enter your question:");
		Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();
        Random rand = new Random();
        
        int r = rand.nextInt(8);
        if(r == 0) {
        System.out.println("As I see it, yes.");
        } else if(r == 1) {
        System.out.println("That souns cool!");
        } else if(r == 2) {
        System.out.println("Nahhh, that's quite unexpected");
        } else if(r == 3) {
        System.out.println("well...it's upto you!");
        } else if(r == 4) {
        System.out.println("You gotta believe when I say this");
        } else if(r == 5) {
        System.out.println("Yeah! You can make it.");
        } else if(r == 6) {
        System.out.println("You should try maybe.");
        } else if(r == 7) {
        System.out.println("Think about it again!");
        }
	}

}
