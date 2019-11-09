package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Condicional5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int id = sc.nextInt();
		int quant = sc.nextInt();
		
		double valor;
		double total;
		
		if(id == 1) {
			valor = 4.00;
			total = valor * quant;
		}else if (id == 2){
			valor = 4.50;
			total = valor * quant;
		}else if (id == 3) {
			valor = 5.00;
			total = valor * quant;
		}else if (id == 4) {
			valor = 2.00;
			total = valor * quant;
		}else {
			valor = 1.50;
			total = valor * quant;
		}
		System.out.printf("TOTAL: R$ %.2f", total);
		


	}

}
