package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		Contract contract = new Contract(parcelas, date, valor);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, parcelas);
		
		System.out.println("Parcelas: ");
		
		for(Installment c : contract.getInstallments()) {
			System.out.println(c);
		}
		
		

	}

}
