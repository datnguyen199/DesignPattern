package com.datnguyen.designpatterns.factory;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	public abstract void prepare();
}
