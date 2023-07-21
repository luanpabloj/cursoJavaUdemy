package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Name: ");
		funcionario.name = sc.next();
		
		System.out.println("Gross salary: ");
		funcionario.salary = sc.nextDouble();
		
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", funcionario.name, funcionario.netSalary());
		
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percent = sc.nextDouble();
		funcionario.increaseSalary(percent);
		
		System.out.println("Updated data: " + funcionario);
		
		
		
		sc.close();

	}

}
