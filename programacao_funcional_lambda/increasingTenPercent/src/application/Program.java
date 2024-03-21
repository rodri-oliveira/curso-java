package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpDate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.00));
		list.add(new Product("hd cast", 80.00));
		
		
		double percent = 1.1;
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * percent);
		
		list.forEach(cons);
		
		list.forEach(System.out::println);

	}

}
