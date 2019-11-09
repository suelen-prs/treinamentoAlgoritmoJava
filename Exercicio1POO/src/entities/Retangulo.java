package entities;

public class Retangulo {
	public double width;
	public double heigth;
	
	public double Area() {
		return width * heigth;
	}
	
	public double Perimeter() {
		return (width * 2) + (heigth * 2);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
	}
	
	public String toString() {
		return "AREA = "
			+ String.format("%.2f", Area())
			+ "\n"
			+ "PERIMETER = "
			+ String.format("%.2f", Perimeter())
			+ "\n"
			+ "DIAGONAL = "
			+ String.format("%.2f", Diagonal());
	}

}
