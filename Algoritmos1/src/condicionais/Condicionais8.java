package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um n�mero e calcule sua raiz quadrada.
 * Caso a raiz seja exata inform�-la, caso contr�rio, informe: 'N�o h� raiz exata para ..'.
 * 
 * */

public class Condicionais8 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		num = input.nextInt();
		
		if(Math.sqrt(num) %2 == 0) {
			System.out.println("A ra�z quadrada de "+num+" �:"+Math.sqrt(num));
		}else {
			System.out.println("N�o h� ra�z exata para "+num);
		}

	}

}
