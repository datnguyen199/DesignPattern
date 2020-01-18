package com.datnguyen.designpatterns.templatemethod;

public class Tea extends CaffeinBeverage {

	@Override
	void brew() {
		System.out.println("Steeping the tea!");
	}

	@Override
	void addCondiments() {
		System.out.println("Addding lemon!");
	}
	
}
