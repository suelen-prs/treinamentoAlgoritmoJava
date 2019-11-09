package course;

import java.util.Scanner;

public class TratamentoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String s01 = original.toUpperCase(); //letra maiuscula
		String s02 = original.toLowerCase(); //letra minuscula
		String s03 = original.trim(); //remove espaço no inicio ou final da sentença
		String s04 = original.substring(2); //retira a quantidade de caracteres indicado, se tiver um parametro retira do inicio
		String s05 = original.substring(2, 9); //retira quantidade de caracteres indicado, se tiver dois parametros retira do inicio e do final da sentença
		String s06 = original.replace('a', 'x'); //substitui a ocorrencia do caractere indicado na primeira variavel pela segunda indicação.
		String s07 = original.replace("abc", "xy"); //substitui as ocorrencias da primeira sentença indicada pelo segunda sentença indicada.
		int i = original.indexOf("bc"); //indica a primeira posição numerica dos caracteres indicados na sentença.
		int j = original.lastIndexOf("bc"); //indica a ultima posição numerica dos caracteres indicados na sentença.
		
		
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring '2': -" + s04 + "-");
		System.out.println("substring '2', '9': -" + s05 + "-");
		System.out.println("replace 'a', 'x': -" + s06 + "-");
		System.out.println("replace 'abc', 'xy': -" + s07 + "-");
		System.out.println("indexOf: 'bc': -" + i + "-");
		System.out.println("lastIndexOf: 'bc': -" + j + "-");


		
		sc.close();

	}

}
