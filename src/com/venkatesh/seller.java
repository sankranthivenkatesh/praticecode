package com.venkatesh;

public class seller implements tax {
        private   String sellerid;
        private   String location;
       private    double taxpercentage=0;
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
		if(location.equals("canada")) {
			taxpercentage=0.02*price;
			
		}
		else if(location.equals("europe")) {
			taxpercentage=0.04*price;
		} 
		else{
			taxpercentage=0.08*price;
		}
		
		return taxpercentage;	
		
		
		
	}

}
