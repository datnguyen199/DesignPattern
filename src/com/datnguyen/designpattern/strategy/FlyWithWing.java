package com.datnguyen.designpattern.strategy;

public class FlyWithWing implements FlyBehaviour {
	
	@Override
	public void fly() {
		System.out.println("Fly with wing");
	}

}
