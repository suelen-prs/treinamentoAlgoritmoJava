package repeticoes;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um número. Mostre apenas os pares entre 1 e o número.
 * 
 * */

public class Repeticoes4 {
	
	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		System.out.println("Os pares entre 1 e "+num+" são: ");
		for (int i = 1; i <=num; i++) {
			if(i %2 == 0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
