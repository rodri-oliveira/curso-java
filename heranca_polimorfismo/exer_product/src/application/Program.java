package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Common, used or imported: (c/u/i)");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			String nameProduct = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(choice == 'c') {
				Product product = new Product(nameProduct, price);
				list.add(product);
			}else if(choice == 'u') {
				System.out.print("Manufactore date: ");
				Date manu = sdf.parse(sc.next());
				Product product = new UsedProduct(nameProduct, price, manu);
				list.add(product);
			}else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(nameProduct, price, customsFee);
				list.add(product);
			}
			System.out.println();
		}
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
