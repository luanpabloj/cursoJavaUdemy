package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] vect = line.split(",");
				list.add(new Employee(vect[0], vect[1], Double.parseDouble(vect[2])));
				line = br.readLine();
			}
			
			System.out.print("Type salary for filter: ");
			Double salary = sc.nextDouble();
			
			Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			//armazena os emails dos funcionários cujo o salário seja mais que o valor fornecido pelo usuário
			List<String> list2 = list.stream().filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail()).sorted(comparator).toList();
			
			//armazena a soma dos salários dos funcionários cujo nome começa com a letra 'M'
			Double allSalary = list.stream().filter(p -> p.getName().toLowerCase().charAt(0) == 'm')
					.map(p -> p.getSalary()).reduce(0.0, (x, y) -> x + y);
			
			
			list2.forEach(System.out::println);
			System.out.println("Sum of salary of people whose name starts with 'M': " + allSalary);
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		};
		
		sc.close();

	}

}
