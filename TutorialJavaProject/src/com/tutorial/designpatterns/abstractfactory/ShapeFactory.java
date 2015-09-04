package com.tutorial.designpatterns.abstractfactory;

import com.tutorial.project.Circle;
import com.tutorial.project.Color;
import com.tutorial.project.Rectangle;
import com.tutorial.project.Shape;
import com.tutorial.project.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public Shape getShap(String shapeType) {
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
