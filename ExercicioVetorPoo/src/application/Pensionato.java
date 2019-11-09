package application;

import java.util.Scanner;

import entities.Estudantes;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estudantes[] vect = new Estudantes[10];
		System.out.print("Quantos quartos deseja alugar: ");
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Aluguel #" + i +":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Estudantes(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos Alugados: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		sc.close();
	}

}
