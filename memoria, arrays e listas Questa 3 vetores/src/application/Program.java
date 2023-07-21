package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double aux = 0;
		int menor = 0;
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoas[] vect = new Pessoas[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + " pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("");
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			System.out.print("");
			System.out.print("idade: ");
			int age = sc.nextInt();
			
			aux+= height;
			
			if(height < 1.60) {
				menor++;
			}
			
			vect[i] = new Pessoas(name, height, age);
			
		}
		
		
		System.out.printf("Altura média: %.2f%n", (aux / n));
		System.out.println("Pessoas com menos de 16 anos: " + (menor * 100 / n) + "%");
		
		for(int i = 0; i < n; i++) {
			
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
			
		}
		
		
		
		
		
		sc.close();
	}

}
