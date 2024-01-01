package application;

import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double amount = 0;
		Bank bank;
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		sc.next();
		System.out.print("Initial balance: ");
		amount = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		bank = new Bank(number, holder, amount, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		amount = sc.nextDouble();
		bank.withdraw(amount);
		
		
		sc.close();
	}

}
