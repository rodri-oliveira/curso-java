package application;

import java.util.ArrayList; // Importa a classe ArrayList para criar uma lista de produtos
import java.util.List; // Importa a interface List para utilizar uma lista genérica
import java.util.Locale; // Importa a classe Locale para definir a formatação numérica
import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

import entities.Product; // Importa a classe Product do pacote entities
import services.CalculationService; // Importa a classe CalculationService do pacote services

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Define o formato numérico para usar o ponto como separador decimal
		Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler dados do usuário

		List<Product> list = new ArrayList<>(); // Cria uma lista de produtos usando a implementação ArrayList

		System.out.print("Enter the number of products: "); // Solicita ao usuário que insira o número de produtos
		int n = sc.nextInt(); // Lê o número de produtos fornecido pelo usuário

		for (int i = 1; i <= n; i++) { // Loop para cada produto que o usuário deseja inserir
			System.out.println("Product #" + i + " data:"); // Informa ao usuário qual produto está sendo inserido
			System.out.print("Name: "); // Solicita ao usuário que insira o nome do produto
			sc.nextLine(); // Consome a quebra de linha pendente
			String name = sc.nextLine(); // Lê o nome do produto fornecido pelo usuário
			System.out.print("Price: "); // Solicita ao usuário que insira o preço do produto
			double price = sc.nextDouble(); // Lê o preço do produto fornecido pelo usuário
			list.add(new Product(name, price)); // Adiciona o produto à lista
		}

		Product x = CalculationService.max(list); // Encontra o produto mais caro da lista usando o serviço
													// CalculationService
		System.out.println("Most expensive:"); // Informa ao usuário que o produto mais caro será exibido
		System.out.println(x); // Exibe o produto mais caro

		sc.close(); // Fecha o Scanner para liberar recursos
	}
}
