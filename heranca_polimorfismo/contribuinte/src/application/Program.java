package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter numbers tax payers: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or Company: (i/c) ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			if(choice == 'i') {
				System.out.print("Spend health: ");
				double spendHealth = sc.nextDouble();
				list.add(new PessoaFisica(name, annualIncome, spendHealth));
			}
			else {
				System.out.print("Numbers Employees: ");
				int numberEmployes = sc.nextInt();
				list.add(new PessoaJuridica(name, annualIncome, numberEmployes));
			}
		}
		System.out.println();
		System.out.println("Taxes Paid: ");
		for(Contribuinte c : list) {
			System.out.println(c.getName() + " : " + String.format("%.2f",c.taxCalculation()));
		}
		
		
		sc.close();

	}

}
