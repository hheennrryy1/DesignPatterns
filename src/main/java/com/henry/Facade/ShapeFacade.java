package com.henry.Facade;

public class ShapeFacade {
	
   private Shape circle;
   private Shape triangle;
   private Shape square;
	
	
	public ShapeFacade() {
		circle = new Circle();
		triangle = new Triangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
