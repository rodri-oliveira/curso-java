package application;

import java.util.Locale;
import java.util.Scanner;

import entities.GrupoPessoas;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will there be type: ");
		int n = sc.nextInt();
		
		GrupoPessoas grupo = new GrupoPessoas(n);
		
		for(int i = 0; i < n; i++) {
			System.out.print("Height " + (i + 1) + " people: ");
			double height = sc.nextDouble();
			System.out.print("Gender " + (i + 1) + " people: ");
			char gender = sc.next().charAt(0);
			
			grupo.adicionarPessoa(i, height, gender);
		}
		
		System.out.println("Shorter height: " + grupo.menorAltura());
		System.out.println("Greater height: " + grupo.calcularMaiorAltura());
		System.out.println("Average weman height: " + grupo.calcularMediaAlturaMulheres());
		System.out.println("Numbers of mens: " + grupo.contarHomens());
		
		sc.close();

	}

}
