package com.datnguyen.designpatterns.factory;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSouce();
	public Cheese createCheese();
}
