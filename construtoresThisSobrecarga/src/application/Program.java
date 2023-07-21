package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank bank = null;
		
		double deposit = 0;
		
		
		System.out.print("Enter account number:");
		int numAccount = sc.nextInt();
		System.out.print("Enter account holder:");
		String name = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		
		if(option == 'y') {
			System.out.print("Enter initial deposit value:");
			deposit = sc.nextDouble();
			
			bank = new Bank(name, numAccount, deposit);
		}
		
		
		else if(option == 'n') {
			 
			 bank = new Bank(name, numAccount);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		deposit = sc.nextDouble();
		bank.depositValue(deposit);
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		deposit = sc.nextDouble();
		bank.withDraw(deposit);
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		
		sc.close();

	}

}
