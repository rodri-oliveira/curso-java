package application;

import java.util.Scanner;

import entities.Matrix;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a row: ");
		int row = sc.nextInt();
		System.out.print("Enter a column: ");
		int column = sc.nextInt();
		
		Matrix matrix = new Matrix(row, column);
		
		System.out.println("Fill out matrix: ");
		matrix.fillMatrix(sc);
		
		System.out.println("Enter a position: ");
		int posiiton = sc.nextInt();
		matrix.findPosition(posiiton);
		
		
		sc.close();

	}

}
