package com.datnguyen.designpatterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temprature;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject wd) {
		this.weatherData = wd;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Temprature: " + this.temprature + " Pressure: " + this.pressure);
	}	

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temprature = temp;
		this.pressure = pressure;
		display();
	}

}
