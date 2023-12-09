package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		int countNegative = 0;
		System.out.println("Numbers negative: ");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					countNegative++; 
					System.out.printf("%d / ", matriz[i][j]);
				}
			}
		}
		
		System.out.println("Amount negative: " + countNegative);
		System.out.println("Size: " + matriz[0].length);
		
		sc.close();

	}

}
