package basic;

public class Methods {

	public static void main(String[] args) {
		welcome();
		multiply(5,200);
		multiply(2,3);
		multiply(4,6);
		divide(10,2);
	}
public static void welcome() {
	System.out.println("Welcome!");
}

public static void multiply(int a, int b) {
	System.out.println(a * b);
}
 public static void divide(int a, int b) {
	 System.out.println(a/b);
 }
}
