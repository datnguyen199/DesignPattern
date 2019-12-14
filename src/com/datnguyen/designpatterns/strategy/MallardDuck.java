package com.datnguyen.designpatterns.strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWing();
	}
}
