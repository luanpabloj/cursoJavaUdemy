package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product;
		
		System.out.print("Digite o nome do produto: ");
		String name = sc.nextLine();
		System.out.print("Digite o valor do produto: ");
		Double value = sc.nextDouble();
		System.out.print("Digite a quantidade: ");
		int quantity = sc.nextInt();
		product = new Product(name, value, quantity);
		
		boolean file = new File("out").mkdirs();
		
		String path = "C:\\Users\\luanp\\eclipse-workspace\\arquivo\\out\\summary.csv";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			bw.write(product.toString());
			bw.newLine();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
//		para imprimir o arquivo no console
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			do {
			System.out.println(line);
			line = br.readLine();
			}while(line != null);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
