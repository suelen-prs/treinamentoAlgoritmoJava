package condicionais;

import java.util.Scanner;

/*
 * Sabendo que o fuso horário da França em relação ao Brasil é de +5 horas,
 * elabore um programa que leia a hora no Brasil e informe a hora na França.
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
		
		System.out.println("São "+horaFranca+"h na França.");
		
		
	}

}
