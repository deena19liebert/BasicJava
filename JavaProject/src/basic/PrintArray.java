package basic;

public class PrintArray {

	public static void main(String[] args) {
		int size = 5;
		  
		  for( int i=0; i<size; i++) {
	        for( int j = 0; j < size; j++) {
	        	if( i == j || i + j == size - 1) {
	        	System.out.print("0");
	        } else {
	        	System.out.print(" ");
	        }
	        }
	        	System.out.println(" ");
	        }

	}

}
