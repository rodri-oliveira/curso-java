package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.00));
		list.add(new Product("hd cast", 80.00));
		
		Function<Product, String> upper = n -> n.getName().toUpperCase();
 		
		List<String> names = list.stream().map(upper).
					collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}

}
