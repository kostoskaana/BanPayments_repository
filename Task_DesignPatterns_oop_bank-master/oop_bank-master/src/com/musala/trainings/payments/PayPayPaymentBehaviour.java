package com.musala.trainings.payments;

public class PayPayPaymentBehaviour implements IPAymentStrategy {

	public PayPayPaymentBehaviour() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void PaymentStrategy() {
		// TODO Auto-generated method stub
		GetToken();
		System.out.print("Payment with Paypal");
		
		
	}
	
	public void GetToken()
	{
		System.out.print("Successful login with the token \n");
	}
	

}
