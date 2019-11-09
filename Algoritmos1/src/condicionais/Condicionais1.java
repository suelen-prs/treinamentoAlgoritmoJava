package condicionais;


/*
 * Elaborar um programa que leia nome e duas notas de um aluno.
 * Informe a média das notas do aluno e se ele foi aprovado ou reprovado.
 * 
 * */


import java.util.Scanner;

public class Condicionais1 {

	public static void main(String[] args) {
		String nome;
		double nota1;
		double nota2;
		double media;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Nome do Aluno: ");
		nome = input.nextLine();
		System.out.print("Nota 1: ");
		nota1 = input.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = input.nextDouble();
		
		media = (nota1 + nota2) / 2;
		System.out.printf("Média das Notas: %.2f\n", media);
		
		String result = (media >= 6.0) ? "Você Foi Aprovado!" : "Você Foi Reprovado.";
		
		System.out.println(result);
		
		input.close();
		
	}

}