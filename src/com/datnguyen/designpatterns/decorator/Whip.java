package com.datnguyen.designpatterns.decorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage b) {
		this.beverage = b;
	}
	
	@Override
	public String getDesciprtion() {
		return beverage.getDesciption() + "Whip";
	}

	@Override
	public int cost() {
		return beverage.cost() + 40;
	}

}
