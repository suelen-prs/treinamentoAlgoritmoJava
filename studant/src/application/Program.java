package application;

import java.util.Scanner;

import entities.Studant;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Studant studant = new Studant();
		System.out.println("ENTRADA");
		studant.name = sc.next();
		studant.notaA = sc.nextInt();
		studant.notaB = sc.nextInt();
		studant.notaC = sc.nextInt();
		
		System.out.printf("FINAL GRADE %.2f%n", studant.notaFinal());
		
		if(studant.notaFinal() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", studant.status());
			
		}else {
			System.out.println("PASS");
		}
		
		
		sc.close();

	}

}
