package course;

import java.util.Scanner;

public class ProgramDois {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);	
		
		String sentence = sc.nextLine();
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}
