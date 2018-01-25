package com.musala.trainings.payments;

public class PaymentFactory {
	
	public Payment payment;
	
	public Payment CreatePayment(String type)
	{
		Payment toReturn = null;
		if(type.equals("Own"))
		{
			toReturn =  new OwnPayment();
		}
		else if(type.equals("Another"))
		{
			toReturn = new AnotherAccount();
		}
		else if(type.equals("Paypal"))
		{
			toReturn = new PayPalPayment();
		}
		
		return toReturn;
		
	}

}
