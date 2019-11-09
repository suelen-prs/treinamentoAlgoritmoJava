package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Retangulo r = new Retangulo();
		
		System.out.println("Enter retangle width and heigth");
		System.out.print("Width: ");
		r.width = sc.nextDouble();
		System.out.print("Heigth: ");
		r.heigth = sc.nextDouble();
		
		r.Area();
		r.Diagonal();
		r.Perimeter();
		
		System.out.println(r);
		
		
		
		sc.close();

	}

}
