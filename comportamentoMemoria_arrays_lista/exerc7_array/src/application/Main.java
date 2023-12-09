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
		double acc = 0.0;
		double average = 0.0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			acc += vect[i];
		}
		
		average = acc / vect.length;
		
		System.out.println();
		
		System.out.printf("Average in the vector: %.3f " , average);
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			if(vect[i] < average) {
				System.out.printf("%.1f\n",vect[i]);
			}
		}
		
		sc.close();

	}

}
