package com.datnguyen.designpatterns.abtractfactory;

public class ClamsPizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public ClamsPizza(PizzaIngredientFactory pf) {
		this.ingredientFactory = pf;
	}

	@Override
	public void prepare() {
		ingredientFactory.createCheese();
		ingredientFactory.createClams();
	}
}
