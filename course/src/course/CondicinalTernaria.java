package course;

import java.util.Scanner;

public class CondicinalTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double preco = sc.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		/*
		if(preco <= 20.0) {
			desconto = preco * 0.10;
		}else {
			desconto = preco * 0.05;
		}
		*/
		
		System.out.println(desconto); 
		
		
		
		sc.close();

	}

}
