package com.musala.trainings.payments;

public class AnotherAccount extends Payment{

	PaymentWithPassword paymentWithPassword;
	PaymentWithPin paymentWithPin;
	public AnotherAccount()
	{
		this.PaymentType = "Another Account";
		paymentWithPassword = new PaymentWithPassword();
		paymentWithPin = new PaymentWithPin();
	}
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
		System.out.print("Payment type: Another Account");
	}
	
	
	@Override
	public void execute(int amount) {
		super.execute(amount);
		System.out.print("checking validation of the recepients IBAN \n");
		if(amount < 25)
		{
			paymentWithPassword.PaymentStrategy();
		}
		else
		{
			paymentWithPin.PaymentStrategy();
		}
	}
	
}
