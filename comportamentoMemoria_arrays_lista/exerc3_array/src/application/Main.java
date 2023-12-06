package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		double acc = 0.0;
		int under16 = 0;
		double average = 0.0;
		double percentUnder16 = 0.0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa: ");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			vect[i] = new Pessoa(name, age, height);
			
			acc += vect[i].getHeight();
		}
		
		average = acc / vect.length;
		
		for(int i = 0; i < n; i++) {
			if(vect[i].getAge() < 16) {
				under16++;
			}
		}
		
		percentUnder16 = (under16 * 100) / vect.length;
		
		System.out.printf("\nAverage height: %.2f\n",  average);
		System.out.printf("People under 16: %.1f%%\n", percentUnder16);
		
		for(int i = 0; i < n; i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
