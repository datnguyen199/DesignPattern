package com.datnguyen.designpattern.strategy;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void setFlyBehaviour(FlyBehaviour f) {
		flyBehaviour = f;
	}
	
	public void setQuackBehaviour(QuackBehaviour q) {
		quackBehaviour = q;
	}
}
