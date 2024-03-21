package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import model.service.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("hd cast", 80.00));
		
		ProductService ps = new ProductService();
		
		Predicate<Product> test = p -> p.getName().charAt(0) == 'T';

		
		double sum = ps.filteredSum(list, test);
		
		System.out.println("Sum: " + String.format("%.2f", sum));

	}

}
