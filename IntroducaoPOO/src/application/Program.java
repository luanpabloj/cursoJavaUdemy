package application;


import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		retangulo retanguloClass = new retangulo();
		
		System.out.println("Digite o valor da base e altura de um retângulo");
		
		retanguloClass.x = sc.nextDouble();
		retanguloClass.y = sc.nextDouble();
		
		System.out.printf("Área: %.2f%n", retanguloClass.area());
		System.out.printf("Perímetro: %.2f%n", retanguloClass.perimetro());
		System.out.printf("Diagonal: %.2f%n", retanguloClass.diagonal());
		
		
		sc.close();
	}

}
