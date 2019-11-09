package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Employee e = new Employee();
		
		System.out.print("Name: ");
		e.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		e.glossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println("Employee: " + e);
		
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		e.increaseSalary(percentage);
		
		System.out.println("Update data: " + e);
		sc.close();

	}

}
