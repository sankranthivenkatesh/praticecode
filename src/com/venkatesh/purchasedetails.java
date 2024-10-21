package com.venkatesh;

public class purchasedetails implements tax {
   private  String purchaseid;
   private  String paymentType;
    private double taxpercentage=0;
     
	public String getPurchaseid() {
		return purchaseid;
	}

	public void setPurchaseid(String purchaseid) {
		this.purchaseid = purchaseid;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getTaxpercentage() {
		return taxpercentage;
	}

	public void setTaxpercentage(double taxpercentage) {
		this.taxpercentage = taxpercentage;
	}

	@Override
	public double calculatetax(double price) {
		// TODO Auto-generated method stub
		if(paymentType.equals("creditcard")) {
			taxpercentage=0.02*price;
			
			
		}
		else if(paymentType.equals("debitcard")) {
			taxpercentage=0.04 * price;
			
		} 
		else{
			taxpercentage=0.08*price;
			
		}
		return taxpercentage;
		
	}
}
