package com.datnguyen.designpatterns.adapter;

public class ShapeFacade {
	Square square;
	Rectangle rectangle;
	
	public ShapeFacade(Square square, Rectangle rectangle) {
		this.square = square;
		this.rectangle = rectangle;
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
}
