package com.datnguyen.designpatterns.strategy;

public class FlyWithEngine implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Fly with engine!");
	}

}
