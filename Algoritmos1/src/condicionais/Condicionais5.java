package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um número. Informe se ele é par ou ímpar.
 * 
 * */

public class Condicionais5 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe um número: ");
		num = input.nextInt();
		
		if(num %2 == 0) {
			System.out.println(num + " é par!");
		}else{
			System.out.println(num + "é impar!");
		}

	}

}
