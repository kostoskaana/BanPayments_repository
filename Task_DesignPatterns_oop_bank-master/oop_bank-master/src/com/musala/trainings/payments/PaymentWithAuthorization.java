package com.musala.trainings.payments;

public class PaymentWithAuthorization implements IPAymentStrategy {

	public PaymentWithAuthorization() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void PaymentStrategy() {
		System.out.print("This payment is with authorization");		
	}

}
