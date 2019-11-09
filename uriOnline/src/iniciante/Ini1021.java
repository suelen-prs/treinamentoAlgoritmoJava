package iniciante;

import java.util.Scanner;

public class Ini1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double valor = sc.nextDouble();
		
		double notas = valor / 100;
		double result1 = valor%100;
		//int notaInt = Integer.parseUnsignedInt(notas);
		//double result2 = notas-result1;
		
		System.out.println(notas + "notas(s) de R$ 100.00");
		System.out.println(result1);
		//System.out.println(result2);

	}

}
