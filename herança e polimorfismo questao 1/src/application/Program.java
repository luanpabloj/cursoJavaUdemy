package application;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char res = sc.next().charAt(0);
			
			
			
			if(res == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				double customsfee = sc.nextDouble();
				
				Product product2 = new ImportedProduct(name, price, customsfee);
				
				list.add(product2);
			}
			
			else if(res == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				Product product1 = new Product(name, price);
				
				list.add(product1);
			}
		
			
			else if(res == 'u') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture date: (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				Product product3 = new UsedProduct(name, price, date);
				
				list.add(product3);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product pd : list) {
			System.out.println(pd.priceTag());
		}
		
		
		sc.close();
	}

}
