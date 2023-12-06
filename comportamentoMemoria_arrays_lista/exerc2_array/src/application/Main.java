package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double acc = 0.0;
		double average = 0.0;

		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			acc += vect[i];
		}

		average = acc / n;

		System.out.print("Values: ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}

		System.out.println("Sum: " + acc);
		System.out.println("Average: " + average);

		sc.close();

	}

}
