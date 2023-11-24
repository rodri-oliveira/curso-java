package application;

import java.util.Scanner;
import entities.BuscaBinaria;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Digite o alvo: ");
        int alvo = sc.nextInt();

        BuscaBinaria busca = new BuscaBinaria();
        int resultado = busca.buscar(array, alvo);

        if (resultado != -1) {
            System.out.println(alvo + " foi encontrado na posição " + resultado);
        } else {
            System.out.println(alvo + " não encontrado. ");
        }

        sc.close();
    }
}

