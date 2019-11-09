package course;

import java.util.Scanner;

public class Wile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		double n = sc.nextDouble();
		
		while(n >= 0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Enter another number: ");
			n = sc.nextDouble();
		}
		System.out.println("Number negative!");
		
		sc.close();

	}

}
