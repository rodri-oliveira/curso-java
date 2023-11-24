package application2;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Enter the name of the product: ");
		product.name = sc.next();
		
		System.out.print("Enter the quantity of the product: ");
		product.quantity = sc.nextInt();
		
		System.out.print("Enter the price of the product: ");
		product.price = sc.nextDouble();
		
		System.out.println("Product data : " + product);
		
		System.out.println("Enter the number of products to be added in stock:  ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Update data : " + product);
		
		System.out.println("Enter the number of product to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update data : " + product);
		
		sc.close();
	}

}
