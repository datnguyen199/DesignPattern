package com.datnguyen.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index >= 0) observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(temprature, humidity, pressure);
		}
	}
	
	public void setMeasurementChanged(float temp, float hum, float pressure) {
		this.temprature = temp;
		this.humidity = hum;
		this.pressure = pressure;
		notifyObservers();
	}

}
