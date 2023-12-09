package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first value: (M)");
		int m = sc.nextInt();
		System.out.print("Enter second value: (N)");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter a position: ");
		int position = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == position) {
					System.out.printf("Position: %d , %d%n", i, j);
					if(j + 1 < mat[i].length) {
						System.out.println("Position right: " + mat[i][j + 1]);
					}
					if(j - 1 >= 0) {
						System.out.println("Position left: " + mat[i][j -1]);
					}
					if(i + 1 < mat.length) {
						System.out.println("Position Down: " + mat[i + 1][j]);
					}
					if(i - 1 >= 0) {
						System.out.println("Position up: " + mat[i - 1][j]);
					}
					System.out.println("------------------------------------");
				}
			}
		}
		
		

		sc.close();

	}

}
