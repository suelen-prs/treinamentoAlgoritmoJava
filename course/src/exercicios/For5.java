package exercicios;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cont = 1;

		for (int i = 1; i <= n; i++) {
			cont = cont * i;
		}

		System.out.println(cont);

		sc.close();

	}

}
