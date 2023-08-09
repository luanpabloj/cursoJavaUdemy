package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Dados> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Employee #" + (i+1));
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Dados dados = new Dados(id, name, salary);
			
			list.add(dados);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		Integer idSearch = sc.nextInt();
		
		Integer search = localizar(list, idSearch);
		
		if(search == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(search).increaseSalary(percent);
		}
		
		System.out.println("List of employees: ");
		for(Dados dados : list) {
			System.out.println(dados);
			
		}
		
		
		
		sc.close();
	}
	
		public static Integer localizar(List<Dados> list, int id) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;
				}

			}
			
			return null;
			
		}

}
