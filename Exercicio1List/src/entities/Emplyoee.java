package entities;

public class Emplyoee {
	private int id;
	private String name;
	private double salary;
	
	public Emplyoee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Emplyoee() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void incrementSalary(double percentage) {
		this.salary += (salary * percentage);
	}
	
	public String toString() {
		return "Id: " + id + " Name:" + name + " Salary: " + String.format("%.2f", salary);
	}

}
