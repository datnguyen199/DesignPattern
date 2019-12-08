package com.datnguyen.designpattern.decorator;

public abstract class Beverage {
	String description = "Beverage";
	
	public String getDesciption() {
		return description;
	}
	
	public abstract int cost();
}
