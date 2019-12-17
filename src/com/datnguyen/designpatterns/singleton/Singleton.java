package com.datnguyen.designpatterns.singleton;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}

}
