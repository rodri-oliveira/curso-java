package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] filds = line.split(",");
				list.add(new Product(filds[0], Double.parseDouble(filds[1])));
				line = br.readLine();
			}
			
			 
			double average = list.stream()
					.mapToDouble(p -> p.getPrice())
					.reduce(0.0, (acc, item) -> acc + item) / list.size();
			
			System.out.println("AVG: " + String.format("%.2f", average));
			
			Comparator<String> comp = (x, y) -> x.toUpperCase().compareTo(y.toUpperCase());
			
			List<String> names = list.stream()
					.filter(x -> x.getPrice() < average)
					.map(x -> x.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			for(String n : names) {
				System.out.println();
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
