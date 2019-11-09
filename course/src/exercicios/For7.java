package exercicios;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i;
		int quadr = 0;
		int cubo = 0;

		for (i = 1; i <= n; i++) {

			quadr = i * i;
			cubo = quadr * i;
			
			System.out.println(i);
			System.out.println(quadr);
			System.out.println(cubo);
			

		}
		
		sc.close();
	}

}
