package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.00));
		list.add(new Product("hd cast", 80.00));
		
		list.removeIf(product -> product.getPrice() >= 100.0);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
