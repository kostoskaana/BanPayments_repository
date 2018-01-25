package com.musala.trainings.payments;

public class PaymentWithPassword implements IPAymentStrategy {

	public PaymentWithPassword() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void PaymentStrategy() {
		// TODO Auto-generated method stub
		System.out.print("This payment is with password \n");
		System.out.print("Enter your password:");
	}
}
