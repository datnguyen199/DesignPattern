package com.datnguyen.designpatterns.adapter;

public class DuckAdapter implements Duck {
	Turkey turkey;

	public DuckAdapter(Turkey tk) {
		this.turkey = tk;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 1; i <= 3; i++)
			turkey.fly();
	}

}
