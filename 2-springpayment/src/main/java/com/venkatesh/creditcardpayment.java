package com.venkatesh;

public class creditcardpayment implements Ipayment {
	public creditcardpayment() {
		System.out.println("credit::constructor");
	}


	public boolean dopay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("creditcard payment");
		return true;
	}

}
