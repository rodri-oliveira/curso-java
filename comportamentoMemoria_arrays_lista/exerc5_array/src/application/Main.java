package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double bigNumber;
		int indice;
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		bigNumber = vect[0];
		indice = 0;
		
		for(int i = 1; i < n; i++) {
			if(vect[i] > bigNumber) {
				bigNumber = vect[i];
				indice = i;
			}
		}
		
		System.out.println("Highest value: " + bigNumber);
		System.out.println("Position: " + indice);
		
		sc.close();
		

	}

}
