package entities;

public class Notas {
	public String name;
	public double nota1, nota2, nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String aprovado() {
		String mensagem;
		if (finalGrade() < 60.00) {
			double media = 60.00 - finalGrade();
			mensagem =  "FAILED MISSING " + String.format("%.2f", media) + " POINTS";
			
		}else {
			mensagem = "PASS";
		}
		return mensagem;
	}
	
	public String toString() {
		return "FINAL GRADE = "
			+ String.format("%.2f", finalGrade())
			+ "\n"
			+ aprovado();
	}

}
