package course;

import java.util.Scanner;

public class WhileFor {
	
	/* Descobrir solucao
	 * Esta super errado!
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h =0;

		while (n <= 0) {
			System.out.println("entre com um numero positivo: ");
			n = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			h = sc.nextInt();
			
			h = Integer.MAX_VALUE;
			
		}
		System.out.println(h);
		sc.close();
	}
}