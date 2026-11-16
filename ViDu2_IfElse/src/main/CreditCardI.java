package main;

import java.util.Scanner;

class CreditCardI {

	public static void main(String[] args) {
		
		final float INTEREST = 0.015f;
		float cardBlance, paymentAmount, remainingBlace, latePaymentFee;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The input card blance: ");
		cardBlance = Float.parseFloat(sc.next());

		System.out.println("The input payment amount: ");
		paymentAmount = Float.parseFloat(sc.next());
		
		remainingBlace = cardBlance - paymentAmount;
		latePaymentFee = 0; 
		
		if(remainingBlace > 0) {
			latePaymentFee = remainingBlace * INTEREST;
		}
			
		System.out.println("The price late payment free: " + latePaymentFee);
	}

}
