package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um n�mero.
 * Mostre o n�mero par seguinte a este n�mero.
 * 
 * */

public class Condicionais6 {
	
	public static void main(String[] args) {
		
		int num;
		int result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		num = input.nextInt();
		
		if(num %2 == 0) {
			num += 2;
		}else {
			num += 1;
		}
		System.out.println("Pr�ximo n�mero par: " + num);

		
		
		
	}
}
