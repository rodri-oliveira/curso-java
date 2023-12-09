package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will there be? ");
		int n = sc.nextInt();
		double[] vectA = new double[n];
		double[] vectB = new double[n];
		double[] sumVect = new double[n];
		
		System.out.println("Enter the values of vetor A: ");
		for(int i = 0; i < n; i++) {
			vectA[i] = sc.nextDouble();
		}
		
		System.out.println("Enter the values of vetor B: ");
		for(int i = 0; i < n; i++) {
			vectB[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < n; i++) {
			sumVect[i] = vectA[i] + vectB[i];
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(sumVect[i]);
		}
		
		sc.close();

	}

}
