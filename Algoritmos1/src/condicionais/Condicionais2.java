package condicionais;

import java.util.Calendar;
import java.util.Scanner;

/*
 * Elaborar um programa que leia nome e ano de nascimento de um aluno.
 * Informe a sua idade e se ele é maior ou menor de idade.
 * 
 * */

public class Condicionais2 {

	public static void main(String[] args) {
		String nome;
		int nascimento;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nome do Aluno: ");
		nome = input.nextLine();
		System.out.print("Ano de Nascimento: ");
		nascimento = input.nextInt();
		
		Calendar c =  Calendar.getInstance();
		int anoAtual = c.get(Calendar.YEAR);
		
		int idade = anoAtual - nascimento;
		System.out.print(nome +  " tem " + idade + " anos.");
		
		String maiorMenorIdade = (idade >= 18) ? " É maior de idade" : " É menor de idade";
		
		System.out.print(maiorMenorIdade);

	}

}
