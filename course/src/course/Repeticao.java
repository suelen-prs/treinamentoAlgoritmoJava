package course;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Value # " + i +": ");
			int num = sc.nextInt();
			soma += num; //soma = soma + num;
			
		}
		
		System.out.print("Soma: " + soma);
		
		sc.close();

	}

}
