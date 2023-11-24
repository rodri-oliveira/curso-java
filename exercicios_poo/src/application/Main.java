package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a altura do retangulo: ");
		double heigth = sc.nextDouble();
		
		System.out.print("Digite a largura do retangulo: ");
		double widht = sc.nextDouble();
		
		Retangulo retangulo = new Retangulo(heigth, widht);

		System.out.printf("A area é: %.2f\n", retangulo.area());
		System.out.printf("O perimetro é: %.2f\n", retangulo.perimeter());
		System.out.printf("A diagonal é: %.2f\n", retangulo.diagonal());
		

		sc.close();

	}

}
