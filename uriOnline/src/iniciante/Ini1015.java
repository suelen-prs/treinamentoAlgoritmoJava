package iniciante;


import java.util.Locale;
import java.util.Scanner;

public class Ini1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();
        double distancia;

        distancia = Math.sqrt(Math.pow(x2-x1, 2)  + Math.pow(y2-y1, 2));

        System.out.printf("\n%.4f", distancia);
        
        entrada.close();

	}

}
