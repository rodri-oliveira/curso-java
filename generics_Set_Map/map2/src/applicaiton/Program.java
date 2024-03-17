package applicaiton;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		for(Map.Entry<Product, Double> entry : stock.entrySet()) {
			Product product = entry.getKey();
			Double quantity = entry.getValue();
			System.out.println("Product: " + product.getName() + " " + "Price: " 
					+ product.getPrice() + " " + "Quantity: " + quantity);
		}
		
		
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
