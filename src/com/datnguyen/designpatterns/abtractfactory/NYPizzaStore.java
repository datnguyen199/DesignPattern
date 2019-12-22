package com.datnguyen.designpatterns.abtractfactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		if("cheese".equals(type)) {
			pizza = new CheesePizza(pizzaIngredientFactory);
		} else if("clams".equals(type)) {
			pizza = new ClamsPizza(pizzaIngredientFactory);
		}
		
		return pizza;
	}

}
