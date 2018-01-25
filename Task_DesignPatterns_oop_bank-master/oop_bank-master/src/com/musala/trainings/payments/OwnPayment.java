package com.musala.trainings.payments;

public class OwnPayment extends Payment{

	PaymentWithAoutAuthorization paymentWithAoutAuthorization;
	PaymentWithAuthorization paymentWithAuthorization;
	
	public OwnPayment()
	{
		this.PaymentType = "Own Payment";
		paymentWithAoutAuthorization = new PaymentWithAoutAuthorization();
		paymentWithAuthorization = new PaymentWithAuthorization();
		
	}
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
		System.out.print("Initializing Payment type: Own Payment");
	}
	
	@Override
	public void execute(int amount) {
		super.execute(amount);
		if(amount < 1000)
		{
			paymentWithAoutAuthorization.PaymentStrategy();
		}
		else
		{
			paymentWithAuthorization.PaymentStrategy();
		}
	}
	

}
