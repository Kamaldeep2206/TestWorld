package com.tutorial.designpatterns.abstractfactory;

import com.tutorial.project.Color;
import com.tutorial.project.Shape;

public abstract class AbstractFactory {
	
	abstract public Color getColor(String color);

	abstract public Shape getShap(String shapeType);
}
