package basic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {

	public static void main(String[] args) {
		 
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2005, 10, 19);
		int age = Period.between(birthDate, today).getYears();
		System.out.println(age);

	}

}
