package application;

import java.util.Locale;
import java.util.Scanner;

import util.DollarConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Whats the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double qtd = sc.nextDouble();
		
		double result = DollarConverter.converter(qtd,dollar );
		
		System.out.printf("Amout to be in real: %.2f\n", result);
		
		sc.close();
	}

}
