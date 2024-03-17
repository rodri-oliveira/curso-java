package services; // Define o pacote onde a classe CalculationService está localizada

import java.util.List; // Importa a interface List para utilizar listas genéricas

public class CalculationService { // Declara a classe CalculationService

	public static <T extends Comparable<T>> T max(List<T> list) { // Declara um método estático chamado max que recebe
																	// uma lista de elementos comparáveis e retorna o
																	// maior elemento
		if (list.isEmpty()) { // Verifica se a lista está vazia
			throw new IllegalStateException("List can't be empty"); // Lança uma exceção se a lista estiver vazia
		}
		T max = list.get(0); // Inicializa a variável max com o primeiro elemento da lista
		for (T item : list) { // Loop sobre todos os elementos da lista
			if (item.compareTo(max) > 0) { // Compara o elemento atual com o máximo atual
				max = item; // Se o elemento atual for maior que o máximo atual, atualiza o máximo
			}
		}
		return max; // Retorna o máximo encontrado na lista
	}
}
