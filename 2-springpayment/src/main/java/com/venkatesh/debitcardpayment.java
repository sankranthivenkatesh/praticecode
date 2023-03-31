package com.venkatesh;

public class debitcardpayment implements Ipayment {
	public debitcardpayment() {
		System.out.println("debit::constructor");
	}
	public boolean dopay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("debit card  payment");
		return true;
	}

}
