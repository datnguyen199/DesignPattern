package com.datnguyen.designpatterns.strategy;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Mute quack!!!");
	}

}
