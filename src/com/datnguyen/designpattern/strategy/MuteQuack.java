package com.datnguyen.designpattern.strategy;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Mute quack!!!");
	}

}