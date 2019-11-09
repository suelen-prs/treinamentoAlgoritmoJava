package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = horas * valor;
		
		System.out.println("Numero: " + num);
		System.out.printf("Salario: R$%.2f", salario);
		
		sc.close();

	}

}
