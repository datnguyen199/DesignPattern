package com.datnguyen.designpatterns.abtractfactory;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Veggies [] veggies;
	
	public abstract void prepare();
}
