package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinepaymentservice;

	public ContractService(OnlinePaymentService onlinepaymentservice) {
		this.onlinepaymentservice = onlinepaymentservice;
	}
	
	public void processContract(Contract contract, int months) {
		double aux = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			LocalDate ld = contract.getDate().plusMonths(i);
			
			double aux3 = onlinepaymentservice.interest(aux, i);
			double aux2 = onlinepaymentservice.paymentFee(aux + aux3);
			double total = aux3 + aux2 + aux;
						
			contract.getInstallments().add(new Installment(ld, total));
		}
	}
	
}
