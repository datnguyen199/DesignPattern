package com.datnguyen.designpatterns.templatemethod;

public abstract class CaffeinBeverageWithHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customersWantCondiments() ) {
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water!");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup!");
	}
	
	boolean customersWantCondiments() {
		return true;
	}
}
