package basic;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String name = "billy bob joe meets the boyz";
		System.out.println("Name: " + name);
		System.out.println("Uppercase: " + name.toUpperCase());
		System.out.println("Lowercase: " + name.toLowerCase());
		System.out.println("First char:" + name.charAt(0));
		System.out.println("Length: " + name.length());
		System.out.println("First char: " + name.charAt(27));
		System.out.println("Substring: " + name.substring(10, 20));
		
		
		java.lang.String result = name.substring(0,1).toUpperCase() + name.substring(1);
		System.out.println(result);
	
	}

}
