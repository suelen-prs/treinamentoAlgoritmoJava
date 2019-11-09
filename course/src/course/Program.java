package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = '\u0046';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which is price $ %.2f%n", product1, price1);
		System.out.printf("%s, which is price $ %.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %2.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %2.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %2.3f%n", measure);
		
		
		
		
	}

}
