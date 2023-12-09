package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rents;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rents[] vect = new Rents[10];
		
		System.out.print("How many customers will you enter ? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent # " + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rents(name, email);
			
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
		}
		
		sc.close();

	}

}
