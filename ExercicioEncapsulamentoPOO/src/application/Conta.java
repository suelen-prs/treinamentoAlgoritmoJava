package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Conta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número da conta: ");
		String numeroConta = sc.nextLine();
		System.out.print("Entre como titular da conta: ");
		String nome = sc.nextLine();
		System.out.print("Existe um deposito inicial (s/n): ");
		char confirma = sc.next().charAt(0);
		Cliente a;
		
		if (confirma == 's' || confirma == 'S') {
			System.out.print("Entre com um valor inicial de deposito: ");
			double depositoInicial = sc.nextDouble();
			a = new Cliente(numeroConta, nome, depositoInicial);
			
		}else {
			a = new Cliente(numeroConta, nome);
		}
		
		System.out.println("Conta atualizada: ");
		System.out.println(a);
		
		System.out.print("Entre com um valor de deposito: ");
		double deposito = sc.nextDouble();
		a.depositoConta(deposito);
		
		System.out.println("Conta atualizada: ");
		System.out.println(a);
		
		System.out.print("Entre com um valor para saque: ");
		double saque = sc.nextDouble();
		a.saqueConta(saque);
		
		System.out.println("Conta atualizada: ");
		System.out.println(a);
		
		
		sc.close();

	}

}
