package com.datnguyen.designpatterns.templatemethod;

public class CoffeeWithHook extends CaffeinBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping coffee!");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk!");
	}
	
	boolean customersWantCondiments() {
		// override hook function from abstract class
		return false;
	}
	
}
