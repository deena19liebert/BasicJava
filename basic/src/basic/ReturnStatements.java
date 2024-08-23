package basic;

public class ReturnStatements {

	public static void main(String[] args) {
		String myName = name("i'm deena liebert");
		System.out.println(myName);

	}
   public static String name(String s) {
	   return s;
	  // return s.toUpperCase();
   }
}
