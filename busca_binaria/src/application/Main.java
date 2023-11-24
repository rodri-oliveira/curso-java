package application;

import java.util.Scanner;

import entities.BuscaBinaria;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = {1,2,3,4,5};
		
		BuscaBinaria busca = new BuscaBinaria(array);
		
		int alvo = sc.nextInt();
		
		int resultado = busca.buscar(alvo);
		
		if(resultado != -1) {
			System.out.println("Valor encontrado :" + resultado);
		}else {
			System.out.println("Valor não encontrado : " + alvo);
		}
		
		sc.close();

	}

}
