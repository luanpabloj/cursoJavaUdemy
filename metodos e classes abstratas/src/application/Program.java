package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> lista = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(ic == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				lista.add(new Individual(name, income, health));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				lista.add(new Company(name, income, employees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		double total = 0.0;
		for(TaxPayer c : lista) {
			System.out.println(c.getName() + ": $" + String.format("%.2f", c.tax()));
			total+= c.tax();
		}
		
		System.out.println("\nTotal taxes: " + String.format("%.2f", total));
	}

}
