package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Approved;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will you type? ");
		int n = sc.nextInt();
		Approved[] approved = new Approved[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter a name, first grade and second grade: ");
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			
			approved[i] = new Approved(name, grade1, grade2);
		}
		
		System.out.println("Students appoved: ");
		
		for(Approved student : approved) {
			if(student.average() >= 6.0) {
				System.out.printf("Name: %s | Average: %.2f%n", 
						student.getNameAluno(), student.average());
			}
		}
		
		sc.close();

	}

}
