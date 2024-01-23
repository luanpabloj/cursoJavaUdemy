package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o saldo inicial: ");
		double saldo = sc.nextDouble();
		ContaBancaria conta = new ContaBancaria(numero, saldo);
		System.out.println();
		
		System.out.print("Digite um valor a ser depositado: ");
		double depositar = sc.nextDouble();
		conta.deposit(depositar);
		System.out.println("Novo saldo: " + conta.getBalance());
		System.out.println();
		
		System.out.print("Digite um valor para ser sacado: ");
		double saque = sc.nextDouble();
		conta.withdraw(saque);
		System.out.println("Novo saldo: " + conta.getBalance());

	}

}
