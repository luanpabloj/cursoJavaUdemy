package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura = 0;
		char genero = 0;
		
		System.out.println("Quantas pessoas serão digitadas");
		int n = sc.nextInt();
		
		Dados[] vect = new Dados[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Altura da " + (i + 1) + " pessoa");
			altura = sc.nextDouble();
			sc.nextLine();
			System.out.println("Gênero da " + (i + 1) + " pessoa");
			genero = sc.next().charAt(0);
			
			
			vect[i] = new Dados(altura, genero);
		}
		
		menorAltura(altura, n, vect);
		maiorAltura(altura, n, vect);
		alturaMulheres(altura, n, vect, genero);
		numHomens(vect, genero);
		
		sc.close();
	}
	
	
	public static void menorAltura(double altura, int n, Dados vect[]) {
		
		Dados auxiliarMenor;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(vect[i].getAltura() < vect[j].getAltura()) {
					auxiliarMenor = vect[i];
					vect[i] = vect[j];
					vect[j] = auxiliarMenor;
				}
				
			}
		}
		
		System.out.printf("Menor altura: %.2f%n", vect[0].getAltura());
		
	}
	
	public static void maiorAltura(double altura, int n, Dados vect[]) {
		
		Dados auxiliarMaior;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(vect[i].getAltura() > vect[j].getAltura()) {
					auxiliarMaior = vect[i];
					vect[i] = vect[j];
					vect[j] = auxiliarMaior;
				}
				
			}
		}
		
		System.out.printf("Maior altura: %.2f%n", vect[0].getAltura());
		
	}

	public static void alturaMulheres(double altura, int n, Dados vect[], char genero) {

		double media = 0;
		int cont = 0;
		
		for(int i = 0; i < n; i++) {
			if(vect[i].getGenero() == 'F' || vect[i].getGenero() == 'f') {
				
				media+= vect[i].getAltura();
				cont++;	
			}
		}
		
		System.out.printf("Media das alturas das mulheres = %.2f%n", ((double) media/cont));
		
		
	}
	
	public static void numHomens(Dados vect[], char genero) {

		int cont = 0;
		int n = 0;
		
		for(int i = 0; i < n; i++) {
			if(vect[i].getGenero() == 'M' || vect[i].getGenero() == 'm') {
				
				cont++;	
			}
		}
		
		System.out.println("Número de homens = " + cont);
		
		
	}
	
	
	
}
