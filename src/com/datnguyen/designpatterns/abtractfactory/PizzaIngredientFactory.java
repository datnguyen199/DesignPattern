package com.datnguyen.designpatterns.abtractfactory;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clams createClams();
	public Veggies [] createVeggies();
}
