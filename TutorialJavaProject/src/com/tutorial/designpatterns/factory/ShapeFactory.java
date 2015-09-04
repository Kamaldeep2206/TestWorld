package com.tutorial.designpatterns.factory;

import com.tutorial.project.Circle;
import com.tutorial.project.Rectangle;
import com.tutorial.project.Shape;
import com.tutorial.project.Square;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;

	}
}
