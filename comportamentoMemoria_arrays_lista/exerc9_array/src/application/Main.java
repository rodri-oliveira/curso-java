package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NomeIdade;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will you type? ");
		int n = sc.nextInt();
		NomeIdade[] vect = new NomeIdade[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Data " + (i + 1) + " people");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			vect[i] = new NomeIdade(name, age);
		}
		
		String oldName = vect[0].getName();
		int oldAge = vect[0].getAge();
		
		for(int i = 1; i < n; i++) {
			if(vect[i].getAge() > oldAge) {
				oldAge = vect[i].getAge();
				oldName = vect[i].getName();
			}
		}
		
		System.out.println("Old people: " + oldName);
		sc.close();

	}

}
