package com.venkatesh;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        purchasedetails obj=new purchasedetails();
        obj.setPaymentType("creditcard");
        obj.setPurchaseid("12224");
       double tax= obj.calculatetax(2500);
       System.out.println("tax for purchasedetails "+tax);
       System.out.println("==============");
       seller obj2=new seller();
       obj2.setLocation("canada");
       obj2.setSellerid("4353fhfdh");
    double   tax1=obj2.calculatetax(1000);
       System.out.println("tax for seller"+tax1);
	}

}
