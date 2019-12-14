package com.datnguyen.designpatterns.decorator;

public class Main {
	public static void main(String[] args) {
		Beverage b = new Espresso();
		b = new Mocha(b);
		b = new Whip(b);
		System.out.println(b.cost());
	}
}
