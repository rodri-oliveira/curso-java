package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee func = new Employee();
		
		System.out.print("Digite o nome do funcionario: ");
		func.nome = sc.next();
		
		System.out.print("Digite o salario: ");
		func.grossSalary = sc.nextDouble();
		
		System.out.print("Digite a taxa:  ");
		func.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + func);
		
		System.out.print("Digite o percentual para acrescentar: ");
		double pecent = sc.nextDouble();
		
		func.increaseSalary(pecent);
		
		System.out.println("Update: " + func);c
		sc.close();

	}

}
