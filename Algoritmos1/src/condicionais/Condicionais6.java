package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um número.
 * Mostre o número par seguinte a este número.
 * 
 * */

public class Condicionais6 {
	
	public static void main(String[] args) {
		
		int num;
		int result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe um número: ");
		num = input.nextInt();
		
		if(num %2 == 0) {
			num += 2;
		}else {
			num += 1;
		}
		System.out.println("Próximo número par: " + num);

		
		
		
	}
}
