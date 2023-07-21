package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversao;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("What is the dollar price?");
		double dolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dolarCont = sc.nextDouble();
		
		double reais = Conversao.CurrencyConverter(dolar, dolarCont);
		
		System.out.println("Amount to be paid in reais = " + reais);
		
		
		
		sc.close();

	}

}
