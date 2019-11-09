package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		ContaCorrente account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Enter initial deposit value (y/n)? ");
		char response = sc.nextLine().charAt(0);
		if(response == 'y') {
			System.out.println("Enter initial value: ");
			double initialDeposit = sc.nextDouble();
			account = new ContaCorrente(number, holder, initialDeposit);
		}else {
			account = new ContaCorrente(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update data: ");
		System.out.println(account);
		
		
	
		
		
		sc.close();
		
		
	}

}
