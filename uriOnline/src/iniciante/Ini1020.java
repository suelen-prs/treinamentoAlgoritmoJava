package iniciante;

import java.util.Scanner;

public class Ini1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dias = sc.nextInt();

		int Ano = dias / 365;
		System.out.println(Ano + " ano(s)");

		int sobraAno = dias % 365;
		int Mes = sobraAno / 30;
		System.out.println(Mes + " mes(es)");

		int sobraMes = sobraAno % 30;
		System.out.println(sobraMes + " dia(s)");

		sc.close();
	}

}
