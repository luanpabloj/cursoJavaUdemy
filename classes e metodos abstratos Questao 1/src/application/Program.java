package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(ic == 'i') {
				System.out.print("Health expenditures: ");
				double expenditures = sc.nextDouble();
				
				TaxPayer taxpayer1 = new Individual(name, income, expenditures);
				
				list.add(taxpayer1);
			}
			
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				TaxPayer taxpayer2 = new Company(name, income, employees);
				
				list.add(taxpayer2);
			}
			
		}
		
		System.out.println("");
		
		double soma = 0;
		
		System.out.println("TAXES PAID:");
		for(TaxPayer i : list) {
			
			System.out.print(i.getName() + ": R$ " + String.format("%.2f%n", i.tax()));
			
			soma+= i.tax();
		}
		
		System.out.println("");
		System.out.printf("TOTAL TAXES R$ %.2f%n", soma);
		
		sc.close();
	}

}
