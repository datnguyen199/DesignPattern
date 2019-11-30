package com.datnguyen.designpattern.strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWing();
	}
}
