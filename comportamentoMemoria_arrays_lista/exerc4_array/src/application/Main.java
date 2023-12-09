package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double acc = 0.0;
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				acc++;
			}
		}
		
		System.out.println("Even numbers: ");
		
		for(int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(" " + vect[i]);
			}
		}
		System.out.println();
		System.out.print("number of even numbers: " + acc);
		System.out.println("");

		sc.close();

	}

}
