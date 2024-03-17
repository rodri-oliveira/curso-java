package entities; // Define o pacote onde a classe Product está localizada

public class Product implements Comparable<Product> { // Declara a classe Product e implementa a interface Comparable,
														// especificando que ela pode ser comparada com outras
														// instâncias de Product

	private String name; // Declaração do atributo name, que armazena o nome do produto
	private Double price; // Declaração do atributo price, que armazena o preço do produto

	public Product(String name, Double price) { // Construtor da classe Product, que recebe um nome e um preço para
												// inicializar os atributos
		this.name = name; // Inicializa o atributo name com o valor passado como argumento
		this.price = price; // Inicializa o atributo price com o valor passado como argumento
	}

	public String getName() { // Método getter para obter o nome do produto
		return name; // Retorna o valor do atributo name
	}

	public void setName(String name) { // Método setter para definir o nome do produto
		this.name = name; // Atribui o valor passado como argumento ao atributo name
	}

	public Double getPrice() { // Método getter para obter o preço do produto
		return price; // Retorna o valor do atributo price
	}

	public void setPrice(Double price) { // Método setter para definir o preço do produto
		this.price = price; // Atribui o valor passado como argumento ao atributo price
	}

	@Override
	public String toString() { // Método toString sobrescrito para retornar uma representação de string do
								// objeto Product
		return name + ", " + String.format("%.2f", price); // Retorna o nome e o preço do produto formatados como uma
															// string
	}

	@Override
	public int compareTo(Product other) { // Método compareTo sobrescrito para comparar dois objetos Product com base no
											// preço
		return price.compareTo(other.getPrice()); // Compara os preços e retorna o resultado da comparação
	}
}
