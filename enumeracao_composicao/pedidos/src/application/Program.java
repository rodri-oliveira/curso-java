package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER CLIENT DATA: ");
		System.out.print("NAME: ");
		String name = sc.next();
		System.out.print("EMAIL: ");
		String email = sc.next();
		System.out.print("BIRTH DATE: (dd/MM/yyy)");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order date: ");
		
		System.out.print("STATUS: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("HOW MANY ITEM TO THIS ORDER: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("ENTER #" + i + " ITEM DATA:");
			System.out.print("PRODUCT NAME: ");
			String productName = sc.next();
			System.out.print("PRODUCT PRICE: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem items = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(items);
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		sc.close();

	}

}
