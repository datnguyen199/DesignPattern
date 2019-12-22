package com.datnguyen.designpatterns.abtractfactory;

public abstract class PizzaStore {
	public abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		return pizza;
	}
}
