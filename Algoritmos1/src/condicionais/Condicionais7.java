package condicionais;

import java.util.Scanner;

/*
 * Sabendo que o fuso hor�rio da Fran�a em rela��o ao Brasil � de +5 horas,
 * elabore um programa que leia a hora no Brasil e informe a hora na Fran�a.
 * 
 * */

public class Condicionais7 {

	public static void main(String[] args) {
		int horaBrasil;
		int horaCorrecao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hora no Brasil: ");
		horaBrasil = input.nextInt();
		int horaFranca = horaBrasil + 5;
		
		if(horaFranca > 24) {
			horaFranca -= 24;
		}
		
		System.out.println("S�o "+horaFranca+"h na Fran�a.");
		
		
	}

}
