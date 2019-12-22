package com.datnguyen.designpatterns.abtractfactory;

public class CheesePizza extends Pizza {
	
	PizzaIngredientFactory pizzaFactory;
	
	public CheesePizza(PizzaIngredientFactory pf) {
		this.pizzaFactory = pf;
	}
	
	@Override
	public void prepare() {
		System.out.println("Prepare cheese pizza");
		pizzaFactory.createDough();
		pizzaFactory.createSauce();
	}

}
