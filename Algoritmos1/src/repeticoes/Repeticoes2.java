package repeticoes;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um n�mero. Mostre os n�meros entre 1 e o n�mero.
 * */

public class Repeticoes2 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		num = input.nextInt();
		
		System.out.println("Os n�meros entre 1 e "+num+" s�o: ");
		for (int i =2 ; i <num; i++) {
			System.out.print(i+ " ");
		}
		
		

	}

}
