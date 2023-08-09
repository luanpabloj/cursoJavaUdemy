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
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = fmt1.parse(sc.next());
	
		Client c1 = new Client(nameClient, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus st = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), st, c1);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName =  sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product p1 = new Product(productName, productPrice);
			OrderItem c2 = new OrderItem(quantity, productPrice, p1);
			
			order.addItem(c2);
			
			
		}
		
		System.out.println("");
		System.out.println(order);
		
		
		
		
		
		sc.close();
	}

}
