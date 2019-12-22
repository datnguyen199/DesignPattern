package com.datnguyen.designpatterns.abtractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new NYDough();
	}

	@Override
	public Sauce createSauce() {
		return new NYSauce();
	}

	@Override
	public Cheese createCheese() {
		return new NYCheese();
	}

	@Override
	public Clams createClams() {
		return new NYClams();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Onion(), new Spinach() };
		return veggies;
	}

}
