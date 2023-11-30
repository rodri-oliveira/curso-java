import java.util.ArrayList;
import java.util.Scanner;

import entities.EncontrarPrimos;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		EncontrarPrimos primo = new EncontrarPrimos();
		
		ArrayList<Integer> primos = primo.encontrarPrimosAteN(n);
		
		System.out.println("Lista de numeros primos: " + primos);
		
		sc.close();

	}

}
