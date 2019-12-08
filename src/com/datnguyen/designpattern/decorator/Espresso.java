package com.datnguyen.designpattern.decorator;

public class Espresso extends Beverage {
	
	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public int cost() {
		return 99;
	}

}
