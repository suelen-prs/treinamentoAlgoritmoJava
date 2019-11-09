package repeticoes;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um número e após informe a tabuada deste número.
 * 
 * */

public class Repeticoes1 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		System.out.println("Tabuada do "+num+":");
		
		for(int i = 0; i<=10; i++) {
			System.out.println(num+" x " +i+ " = "+num*i);
			
		}

	}

}
