package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um n�mero. Informe se ele � par ou �mpar.
 * 
 * */

public class Condicionais5 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		num = input.nextInt();
		
		if(num %2 == 0) {
			System.out.println(num + " � par!");
		}else{
			System.out.println(num + "� impar!");
		}

	}

}
