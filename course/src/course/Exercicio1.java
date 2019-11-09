package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String name = sc.nextLine();
		int n1 = sc.nextInt();
		Double value = sc.nextDouble();
		
		String lastName = sc.next();
		int age = sc.nextInt();
		Double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(n1);
		System.out.println(value);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
	}
}
