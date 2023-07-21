package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int[] quartos = new int[10];
		Dados[] vect = new Dados[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			
			vect[i] = new Dados(name, email);
			
			System.out.print("Room: ");
			quartos[i] = sc.nextInt();
			
			
		}
		
		int auxQuartos = 0;
		Dados auxVect;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(quartos[i] < quartos[j]) {
					auxQuartos = quartos[i];
					quartos[i] = quartos[j];
					quartos[j] = auxQuartos;
					
					auxVect = vect[i];
					vect[i] = vect[j];
					vect[j] = auxVect;
					
				}
			}
		}
		
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < n; i++) {
			if(quartos[i] != 0)
			System.out.println(quartos[i] + ": " + vect[i].getName() + ", " + vect[i].getEmail());
		}
		
		
		
		
		sc.close();

	}

}
