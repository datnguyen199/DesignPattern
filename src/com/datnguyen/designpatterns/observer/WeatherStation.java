package com.datnguyen.designpatterns.observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherDataBuildInJava wd = new WeatherDataBuildInJava();
		ConditionCurrentDisplayBuildIn cd = new ConditionCurrentDisplayBuildIn(wd);
		wd.setMeasurements(40.0f, 30.6f, 32.5f);
	}
}
