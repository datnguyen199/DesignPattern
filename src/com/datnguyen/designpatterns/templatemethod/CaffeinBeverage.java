package com.datnguyen.designpatterns.templatemethod;

public abstract class CaffeinBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water!");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup!");
	}
}
