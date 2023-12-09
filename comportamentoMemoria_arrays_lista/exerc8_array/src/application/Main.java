package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements will there be in the vector? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double acc,average;
		acc = 0.0;
		average = 0.0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			if(vect[i] % 2 == 0) {
				acc += vect[i];
			}
		}
		
		System.out.println("numeros pares " + acc);
		
		average = acc / n;
		
		if(acc == 0.0) {
			System.out.print("No even number: ");
		}else {
			System.out.printf("Average of the even numers: %.1f ", average);
		}
		
		
		sc.close();

	}

}
