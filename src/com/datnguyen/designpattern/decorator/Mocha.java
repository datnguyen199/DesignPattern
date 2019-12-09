package com.datnguyen.designpattern.decorator;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesciprtion() {
		return beverage.getDesciption() + "Mocha";
	}

	@Override
	public int cost() {
		return beverage.cost() + 15;
	}

}
