package basic;

import java.util.HashSet;

public class Hashhset {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("lemur");
		h.add("orangutan");
		h.add("spider monkey");
		h.add("gorilla");
		
		h.remove("spider monkey");
		
		System.out.println(h.contains("spider monkey"));
		System.out.println(h.size());
		System.out.println(h);
		
		Object[] obj = h.toArray();
		System.out.println(h);
		
	}

}
