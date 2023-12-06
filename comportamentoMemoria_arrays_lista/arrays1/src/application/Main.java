package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Products[] vect = new Products[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += vect[i].getPrice();
		}
		
		double result = soma / n;
		
		System.out.printf("The average is: R$ %.2f " , result);
		
		sc.close();

	}

}
