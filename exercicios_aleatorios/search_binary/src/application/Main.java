package application;

import java.util.Scanner;
import entities.BuscaBinaria;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Digite o alvo: ");
        int alvo = sc.nextInt();

        BuscaBinaria busca = new BuscaBinaria(array, alvo);
        
        int result = busca.buscar();
        
        if(result != -1 ) {
        	System.out.printf("Alvo %.d encontrado na posi��o %d", alvo , result);
        }else {
        	System.out.println("Alvo n�o encontrado: ");
        }
        
        sc.close();
    }
}

