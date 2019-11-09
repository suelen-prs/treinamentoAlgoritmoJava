package repeticoes;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um número. Mostre os números entre 1 e o número.
 * */

public class Repeticoes2 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		System.out.println("Os números entre 1 e "+num+" são: ");
		for (int i =2 ; i <num; i++) {
			System.out.print(i+ " ");
		}
		
		

	}

}
