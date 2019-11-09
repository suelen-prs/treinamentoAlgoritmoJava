package exercicios;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double result = 0;

		for (int i = 0; i < n; i++) {
			double x = sc.nextInt();
			double y = sc.nextInt();

			if (y != 0) {
				result = x / y;
				System.out.println(result);
			} else {
				System.out.println("Divisão impossivel!");
			}

		}

		sc.close();

	}

}
