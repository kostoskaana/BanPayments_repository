package com.musala.trainings.payments;

public class Payment {

	public String PaymentType;
	public int amount;
	
    public void initialize() {
    	System.out.print("Initializing payment.......");
    }

    public void execute(int amount) {
    	System.out.print("Payment starts to execute............");
    }
}
