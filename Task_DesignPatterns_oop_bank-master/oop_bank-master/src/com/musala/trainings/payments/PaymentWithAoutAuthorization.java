package com.musala.trainings.payments;

public class PaymentWithAoutAuthorization implements IPAymentStrategy {

	 public PaymentWithAoutAuthorization() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void PaymentStrategy() {
		System.out.print("This payment is without authorization");		
	}
}
