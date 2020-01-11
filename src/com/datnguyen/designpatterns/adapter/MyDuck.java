package com.datnguyen.designpatterns.adapter;

public class MyDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

	@Override
	public void fly() {
		System.out.println("My duck is flying!");
	}

}
