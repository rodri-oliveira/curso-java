package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.NumerosPrimo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		NumerosPrimo numeroPrimo = new NumerosPrimo();
		
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> primos = numeroPrimo.encontrarPrimo(n);
		
		System.out.println(primos);
		
		
		sc.close();
	}

}
