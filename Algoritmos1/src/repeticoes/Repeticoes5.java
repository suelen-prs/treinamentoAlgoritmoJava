package repeticoes;

/*
 * Elaborar um programa que leia 2 n�meros. Mostre os n�meros entre eles, incluindo-os.
 * */

import java.util.Scanner;

public class Repeticoes5 {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		num1 = input.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = input.nextInt();
		
		
		
		if(num2<num1) {
			System.out.print("N�meros entre "+num2+" e "+num1+": ");
			for (int i = num2; i <=num1; i++) {
				System.out.print(i + " ");
			}
				
			}else {
				System.out.print("N�meros entre "+num1+" e "+num2+": ");
				for (int j = num1; j <=num2; j++) {
					System.out.print(j+" ");
					
				}
			}
		}
	}


