package basic;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("bobbyJoe1994 ", " FluffyP0nies!");
		hashmap.put("deenaLiebert ", " Aloevera?");
		hashmap.put("jenLiebert ", " whatAreYou?");
		
		System.out.println(hashmap);
		hashmap.remove("bobbyJoe1994 ");
		System.out.println(hashmap);
		System.out.println(hashmap.containsValue(" whatAreYou?"));
		System.out.println(hashmap.replace("deenaLiebert ", " iAmAHuman"));
		System.out.println(hashmap);
		
	    
		/*HashMap<String, Integer> hashy = new HashMap<String, Integer>();
		hashy.put("a", 10);
		hashy.put("b", "4");
		hashy.put("c", 88);
		hashy.put("d", 100);
		hashy.put("e", 67);
		System.out.println(hashy); */
	}

}
