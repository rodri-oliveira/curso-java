package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double acc = 0.0;
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			acc += vect[i];
		}
		
		double average = acc / n;
		
		System.out.println(String.format("%.2f", average));
		
		sc.close();

	}

}
