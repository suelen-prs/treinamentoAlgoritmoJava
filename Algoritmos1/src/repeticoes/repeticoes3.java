package repeticoes;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um número. Mostre os 10 números seguintes a ele.
 * */

public class repeticoes3 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = input.nextInt();
		
		System.out.print("Próximos 10 números: ");
		for (int i = num+1; i <=num+10; i++) {
			System.out.print(i+" ");
		}
		
	}

}
