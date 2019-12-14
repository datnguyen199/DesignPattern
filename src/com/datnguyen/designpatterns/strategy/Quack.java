package com.datnguyen.designpatterns.strategy;

public class Quack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Quack!");
	}
}
