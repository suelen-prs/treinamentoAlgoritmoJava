package exercicios;

import java.util.Scanner;

public class ExercCondicionante {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite 3 n�meros na sequenncia: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior �: " + num1);
			
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior �: " + num2);
			
		}else {
			System.out.println("O maior �: " + num3);
		}
		
		
		sc.close();

	}

}
