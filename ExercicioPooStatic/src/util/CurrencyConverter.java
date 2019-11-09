package util;

public class CurrencyConverter {
	
	public static final double DOLLAR_REAL = 3.10;
	
	public static double converter(double dollar) {
		return 1.06 * DOLLAR_REAL * dollar;
	}

}
