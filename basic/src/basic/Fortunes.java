package basic;

import java.util.Random;

public class Fortunes {
	        String[] fortunes = {"Delight the world with compassion, kindness and grace.", 
			"The early bird gets the worm, but the second mouse gets the cheese.",
			"The fortune you seek is in another cookie.",
			"Some days you are pigeon, some days you are statue. Today, bring umbrella.",
			"The fortune you seek is in another cookie.",
			"Your reality check about to bounce.",
			"Tension is who you think you should be. Relaxation is who you are.",
			"When blind leading the blind……..get out of the way.",
			"A foolish man listens to his heart. A wise man listens to cookies.",
			"Everyone seems normal until you get to know them.",
			"Only difference between rut and a grave is depth."};
	
	

	public static void main(String[] args) {
		Random rand = new Random();
		
		int r = rand.nextInt(fortunes.length) + 1;
		System.out.println(fortunes[r]);

	}

}
