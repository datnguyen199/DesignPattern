package com.datnguyen.designpatterns.command;

public class SimpleRemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand slot = new LightOnCommand(light);
		remote.setCommand(slot);
		remote.buttonWasPressed();
	}
}
