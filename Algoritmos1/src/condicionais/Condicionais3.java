package condicionais;

import java.util.Scanner;

/*
 * Elaborar um programa que leia nome, sexo (M ou F) e altura de uma pessoa.
 * Calcular e apresentar o seu peso ideal conforme as fórmulas:
 * - para homens: (72.7*altura)-58
 * - para mulheres: (62.1*altura)-44.7
 * */

public class Condicionais3 {

	public static void main(String[] args) {
		String nome;
		char sexo;
		double altura;
		double pesoIdeal = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Sexo: ");
		sexo = input.next().charAt(0);
		System.out.print("Altura: ");
		altura = input.nextDouble();
		
		if(sexo == 'm' || sexo == 'M') {
			pesoIdeal = (72.7 * altura) - 58;
			
		}else if (sexo == 'f' || sexo == 'F'){
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		System.out.printf("Seu peso ideal é %.2f Kg", pesoIdeal);

		


	}

}
