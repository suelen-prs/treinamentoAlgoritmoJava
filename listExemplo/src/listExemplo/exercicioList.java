package listExemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicioList {

	public static void main(String[] args) {
		int id;
		String name;
		double salary;
		double percentage;
		
		ArrayList<Integer> listId = new ArrayList<>();
		ArrayList<String> listName = new ArrayList<>();
		ArrayList<Double> listSalary = new ArrayList<>();
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("How many employees will be registered: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Employee #" + i);
			
			System.out.print("Id: ");
			id = sc.nextInt();
			listId.add(id);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			name = sc.nextLine();
			listName.add(name);
			
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			listSalary.add(salary);
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		id = sc.nextInt();
		int positionId = listId.indexOf(id);
		System.out.println("Enter the percentage: ");
		percentage = sc.nextDouble();
		double percentageDecimal = (percentage / 100) + 1;
		double upSalary = listSalary.get(positionId) * percentageDecimal;
		
		listSalary.remove(listId.indexOf(id));
		listSalary.add(upSalary);
		
		System.out.print("List of employees: ");
		for(int x : listId) {
			System.out.println(x +"");
		}
		for(String x : listName) {
			System.out.print(x + "");
		}
		for(double x : listSalary) {
			System.out.println(x);
		}
		
		
		

		sc.close();
	}

}
