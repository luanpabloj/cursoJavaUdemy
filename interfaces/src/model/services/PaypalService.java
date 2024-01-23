package model.services;

public class PaypalService implements OnlinePaymentService{
	

	@Override
	public Double paymentFee(double amount) {
		return amount * 0.02; 
	}

	@Override
	public Double interest(double amount, Integer months) {
		return amount * 0.01 * months;
	}
	
}
