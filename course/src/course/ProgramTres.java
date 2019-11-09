package course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTres {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n1 = sc.nextInt(); //35
		sc.nextLine(); //flush - limpeza de stream de entrada
		String name = sc.nextLine(); //Bob Brown
		char gender = sc.next().charAt(0); //F
		
		String s = sc.next(); //b5
		char letter = s.charAt(0); //divide string b
		int digit = Integer.parseInt(s.substring(1)); //divide int 5
		
		double n2 = sc.nextDouble();
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		
		sc.close();
	}

}
