package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia descrição e preço de um produto.
 * Se o preço for inferior a R$ 100, exiba "Somente à vista", senão, exiba "Pode pagar em 3x de ..." e o valor da parcela.
 * 
 * */

public class Condicionais4 {

	public static void main(String[] args) {
		String produto;
		double preco;
		double parcela = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Produto: ");
		produto = input.nextLine();
		
		System.out.print("Preço: ");
		preco = input.nextDouble();
		
		if (preco < 100.00) {
			System.out.println("Somente à vista.");
		}else {
			parcela = preco/3;
			System.out.printf("Pode pagar em 3x de %.2f a parcela", parcela);
		}

	}

}
