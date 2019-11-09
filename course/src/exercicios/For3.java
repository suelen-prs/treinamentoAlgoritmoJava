package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double nota = 0;
		
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			nota = ((x * 2) + (y * 3) + (z * 5)) / 10;
			System.out.printf("%.1f%n", nota);

						
		}
		
		sc.close();

	}

}
