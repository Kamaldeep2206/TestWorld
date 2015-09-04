package com.tutorial.designpatterns.facade;

import com.tutorial.project.Circle;
import com.tutorial.project.Rectangle;
import com.tutorial.project.Shape;
import com.tutorial.project.Square;

public class ShapeMaker {
	Shape circle;
	Shape rectangle;
	Shape square;
	
	public ShapeMaker() {
		// TODO Auto-generated constructor stub
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle()
	{
		circle.draw();
	}
	public void drawRectangle()
	{
		rectangle.draw();
	}
	
	public void drawSquare()
	{
		square.draw();
	}

}
