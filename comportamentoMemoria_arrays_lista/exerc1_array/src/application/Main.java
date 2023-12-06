package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[9];
		System.out.print("Quantos numero voce vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();

	}

}
