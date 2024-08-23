package basic;

import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
        
		try (Scanner scan = new Scanner (System.in)) {
			String[] answers = {"c", "a", "d"};
			String[] responses = {"", "", ""};
			
			System.out.println("What is the capital of Japan?");
			System.out.println("a) Kyoto");
			System.out.println("b) Saitama");
			System.out.println("c) Tokyo");
			System.out.println("d) Osaka");
			
			System.out.println("What is the capital of North Carolina?");
			System.out.println("a) Raleigh");
			System.out.println("a) Durham");
			System.out.println("a) Cary");
			System.out.println("a) Winston-Salem");
			
			System.out.println("What is the fastest land animal?");
			System.out.println("a) Tiger");
			System.out.println("b) Panther");
			System.out.println("c) Wolf");
			System.out.println("d) Cheetah");
			
			responses[0] = scan.next();
			responses[1] = scan.next();
			responses[2] = scan.next();
			
			int score = 0;
			
			for(int i = 0; i < 3; i++) {
				if(responses[i].equalsIgnoreCase(answers[i])) {
					score++;
				}
			}
			System.out.println("Score: " + score + "/3");
		}
	}

}
