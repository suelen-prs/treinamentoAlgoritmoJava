package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas nt = new Notas();
		
		nt.name = sc.nextLine();
		nt.nota1 = sc.nextDouble();
		nt.nota2 = sc.nextDouble();
		nt.nota3 = sc.nextDouble();
		
		System.out.println(nt.toString());
		
		sc.close();

	}

}
