package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.AccountExceptions;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			account = new Account(number, holder, balance, limit);
			
			System.out.print("\nEnter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.Withdraw(amount);
			
			System.out.println("\n" + account);
		}
		catch(AccountExceptions e){
			System.out.println("Account error: " + e.getMessage());
		}
	}

}
