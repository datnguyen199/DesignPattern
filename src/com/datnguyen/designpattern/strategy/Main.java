package com.datnguyen.designpattern.strategy;

public class Main {
	public static void main(String[] args) {
		Duck d = new MallardDuck();
		FlyBehaviour f = new FlyWithEngine();
		d.setFlyBehaviour(f);
		d.performQuack();
		d.performFly();
	}
}
