package com.datnguyen.designpatterns.templatemethod;

public class Coffee extends CaffeinBeverage {

	@Override
	void brew() {
		System.out.println("Dripping coffee!");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk!");
	}

}
