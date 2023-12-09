package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will you enter: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee: #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already exist, try again: ");
				id = sc.nextInt();
			}
				
				
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}

		System.out.print("Enter the employee who will add the percente to salary: ");
		int idPercente = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idPercente)
						.findFirst().orElse(null);
		
		
		if (emp == null) {
			System.out.println("Id does not found: ");
		}else {
			System.out.println("Enter a percente: ");
			double perc = sc.nextDouble();
			emp.increaseSalary(perc);
		}

		for (Employee e : list) {
			//System.out.printf("ID: %d , Name: %s , R$ %.2f%n", emp.getId(), emp.getName(), emp.getSalary());
			System.out.println(e);
		}

		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	

}
