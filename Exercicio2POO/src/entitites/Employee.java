package entitites;

public class Employee {
	public String name;
	public double glossSalary;
	public double tax;
	
	public double netSalary() {
		return glossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		glossSalary  += (glossSalary * (percentage / 100));
	}
	
	public String toString() {
		return "Employe: "
			+ name
			+", "
			+ String.format("%.2f", netSalary());
	}

}
