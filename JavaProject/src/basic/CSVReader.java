package basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		
		String path ="/Users/Admin/OneDrive/Desktop/Documents/SacramentocrimeJanuary2006.csv";
		String line = "";
		
		try {
		   BufferedReader br = new BufferedReader(new FileReader(path));
		   
		   while((line = br.readLine()) != null) {
			   System.out.println(line);
			   String[] values = line.split(",");
			   System.out.println("Date: " + values[0] + ", Crime Description: " + values[5]);
		   }
		   
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			catch (IOException e) {
				e.printStackTrace();
		}
	}

}
