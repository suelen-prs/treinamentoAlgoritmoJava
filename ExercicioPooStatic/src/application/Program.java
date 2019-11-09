package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the Dollar price: %.2f%n", CurrencyConverter.DOLLAR_REAL);
		System.out.print("How many Dollars will be bought: ");
		double dollar = sc.nextDouble();
		double total = CurrencyConverter.converter(dollar);
		System.out.printf("Amout to be paid in Reais: %.2f%n", total);
		
		sc.close();

	}

}
