package basic;

public class ForLoops {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("It's freaking hot!");
		}
		String[] colors = {"Yellow", "Blue", "Grey"};
		for(int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}
		String[][] fancyColors = {{"Red", "Yellow"}, {"Blue", "Grey"}, {"Green", "Pink"}};
		for(int i = 0; i<3; i++) {
			for(int j = 0; j < 2; j++) {
			System.out.println(fancyColors[i][j]);	
		}
		
		}
		
	}

}
