package com.datnguyen.designpatterns.strategy;

public class FlyWithWing implements FlyBehaviour {
	
	@Override
	public void fly() {
		System.out.println("Fly with wing");
	}

}
