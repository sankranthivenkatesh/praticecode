package com.venkatesh;

public class paymentservice {
	private Ipayment payment;
	public paymentservice() {
		System.out.println("paymentservice::constructor");
	}
	
	
	public paymentservice(Ipayment payment) {
		
		this.payment = payment;
	}


	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	public void service(double amount) {
	boolean b=	payment.dopay(amount);
	if(b) {
		System.out.println("payment done and receipt download");
	}
	else {
		System.out.println("payment not done");
	}
	}


}
