package exercicios;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B && A % B == 0) {
			System.out.println("SAO MULTIPLOS");
							
			}else if (B > A && B % A == 00) {
				System.out.println("SAO MULTIPLOS");
				
			}else {
				System.out.println("NAO SAO MULTIPLOS");
			}
		sc.close();
		}
}

	


