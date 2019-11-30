package com.datnguyen.designpattern.strategy;

public class FlyWithEngine implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Fly with engine!");
	}

}
