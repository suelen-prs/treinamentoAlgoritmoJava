package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		double total = 0;
		
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
			total += vect[i].getPreco();
		}
		
		double media = total / vect.length;
		
		System.out.printf("Média de preço dos produtos cadastrados: R$%.2f%n", media);
		sc.close();

	}

}
