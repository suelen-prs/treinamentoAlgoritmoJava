package repeticoes;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um n�mero. Mostre os 10 n�meros seguintes a ele.
 * */

public class repeticoes3 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		num = input.nextInt();
		
		System.out.print("Pr�ximos 10 n�meros: ");
		for (int i = num+1; i <=num+10; i++) {
			System.out.print(i+" ");
		}
		
	}

}
