package com.musala.trainings.payments;

public class PayPalPayment extends Payment{
	
	public PayPayPaymentBehaviour paypalpaymentbeghaviour;
	public PayPalPayment()
	{
		this.PaymentType = "PayPal Payment";
		paypalpaymentbeghaviour = new PayPayPaymentBehaviour();
	}
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
		System.out.print("Initializing Payment type: Paypall Payment");
	}
	
	@Override
	public void execute(int amount) {
		// TODO Auto-generated method stub
		ValidateAmount(amount);
		paypalpaymentbeghaviour.PaymentStrategy();
		super.execute(amount);
	}
	
	public void ValidateAmount(int amount)
	{
		if(amount > 0 )
		{
			System.out.print("Valid amount. \n");
		}
	}
}