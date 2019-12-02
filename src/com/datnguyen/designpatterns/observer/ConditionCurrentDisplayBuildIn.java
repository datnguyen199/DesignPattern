package com.datnguyen.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ConditionCurrentDisplayBuildIn implements Observer, DisplayElement {
	private Observable observable;
	private float temprature;
	private float humidity;
	
	public ConditionCurrentDisplayBuildIn(Observable o) {
		this.observable = o;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current condition: " + "temprature: " + this.temprature
		+ "F degree and humidity: " + this.humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherDataBuildInJava) {
			WeatherDataBuildInJava wd = (WeatherDataBuildInJava) o;
			this.temprature = wd.getTemprature();
			this.humidity = wd.getHumidity();
			display();
		}
	}

}
