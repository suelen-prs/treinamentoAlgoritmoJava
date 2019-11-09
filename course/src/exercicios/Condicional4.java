package exercicios;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int hora1 = sc.nextInt();
		int hora2 = sc.nextInt();
		
		int duracao;
		
		if(hora1 < hora2) {
			duracao = hora2 - hora1;
			
		}else {
			duracao = 24 - (hora1 +hora2);
			
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS.");
		sc.close();
		
	}

}
