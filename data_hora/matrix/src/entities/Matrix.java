package entities;

import java.util.Scanner;

public class Matrix {
	
	private int[][] mat;
	
	public Matrix(int row, int column) {
		mat = new int[row][column];
	}
	
	public void fillMatrix(Scanner sc) {
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public void findPosition(int position) {
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == position) {
					System.out.printf("Position: %d , %d%n", i, j);
					
					if(j + 1 < mat[i].length) {
						System.out.println("Position right: " + mat[i][j + 1]);
					}
					if(j - 1 >= 0) {
						System.out.println("Position left: " + mat[i][j -1]);
					}
					if(i - 1 >= 0) {
						System.out.println("Position up: " + mat[i -1][j]);
					}
					if(i + 1 < mat.length) {
						System.out.println("Position down: " + mat[i + 1][j]);
					}
					System.out.println("-----------------------------------------");
				} 
			}
		}
	}

}
