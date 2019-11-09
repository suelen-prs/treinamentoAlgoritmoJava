package entities;

public class Studant {
	public String name;
	public double notaA;
	public double notaB;
	public double notaC;
	
	
	public double notaFinal() {
		return notaA + notaB + notaC;
	}
	public double status() {
		if(notaFinal() < 60) {
			return 60 - notaFinal();
		}else {
			return 0;
		}	
	}

}
