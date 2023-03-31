package com.venkatesh;

public class Car {
	private Iengine engine;

	public Car(Iengine engine) {
		
		this.engine = engine;
	}
 public void drive() {
	int a= engine.start();
	 if(a>=1) {
		 System.out.println("start the gerny");
	 }
	 else 
		 System.out.println("not start");
 }
}
