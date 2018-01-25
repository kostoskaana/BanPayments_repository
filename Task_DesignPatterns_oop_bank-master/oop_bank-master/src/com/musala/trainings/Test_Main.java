package com.musala.trainings;

import java.util.Scanner;

import com.musala.trainings.customers.Customer;
import com.musala.trainings.payments.Payment;
import com.musala.trainings.payments.PaymentFactory;

public class Test_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the user email");
		String email=in.next();
		Customer customer = new Customer(email);
		
		System.out.print("Choose type of payment: Own, Another account or Paypal");
		String paymentType = in.next();
//Factory pattern, creates the type of payment 		
		customer.createPayment(paymentType);
		System.out.print("\n");
//Strategy pattern, execute the payment depends on the amount and type
		System.out.print("Enter the amount of your payment");
		int amount = in.nextInt();
	    customer.executePayment(amount);
		
		System.out.print("\n Successfull payment");
		
		
	}

}
