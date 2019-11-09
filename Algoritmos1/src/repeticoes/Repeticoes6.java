package repeticoes;

import java.util.Scanner;

/*
 * Elaborar um programa que leia produto e valor.
 * Exiba o valor das parcelas para pagamentos em 1x até 10x.
 * */

public class Repeticoes6 {

	public static void main(String[] args) {
		String produto;
		double valor;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Nome do Produto: ");
		produto = input.nextLine();
		System.out.print("Valor do Produto: ");
		valor = input.nextDouble();
		
		for (int i = 1; i <= 10; i++) {
			double parcela = valor/i;
			System.out.printf("Valor da parcela em %d x: R$ %.2f \n", i, parcela);
			
		}
		
	}

}
