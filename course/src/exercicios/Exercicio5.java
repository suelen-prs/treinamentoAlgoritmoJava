package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner (System.in);
		
		int cod1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double total1 = quant1 * preco1;
		double total2 = quant2 * preco2;
		
		double totalGeral = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", totalGeral);

	}

}
