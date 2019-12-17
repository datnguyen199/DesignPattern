package com.datnguyen.designpatterns.singleton;

public class Singleton3 {
	// doesn't work for java 4 or earlier
	private volatile static Singleton3 uniqueInstance;
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		if(uniqueInstance == null) {
			synchronized (uniqueInstance) {
				uniqueInstance = new Singleton3();
			}
		}
		return uniqueInstance;
	}
}
