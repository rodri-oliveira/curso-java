package application1;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter de measures of triangle x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter de measures of triangle y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A area do triangulo X é %.4f\n", areaX);
		System.out.printf("Area do triangulo Y é %.4f\n", areaY);

		if(areaX > areaY) {
			System.out.printf("A maior area é X");
		}else {
			System.out.printf("A maior area é Y");
		}
		
		sc.close();

	}

}
