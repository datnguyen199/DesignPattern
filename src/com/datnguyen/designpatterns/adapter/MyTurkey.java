package com.datnguyen.designpatterns.adapter;

public class MyTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble!");
	}

	@Override
	public void fly() {
		System.out.println("My turkey is flying!");
	}

}
