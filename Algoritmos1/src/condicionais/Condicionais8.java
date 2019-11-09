package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia um número e calcule sua raiz quadrada.
 * Caso a raiz seja exata informá-la, caso contrário, informe: 'Não há raiz exata para ..'.
 * 
 * */

public class Condicionais8 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		if(Math.sqrt(num) %2 == 0) {
			System.out.println("A raíz quadrada de "+num+" é:"+Math.sqrt(num));
		}else {
			System.out.println("Não há raíz exata para "+num);
		}

	}

}
