package com.tutorial.designpatterns.abstractfactory;

import com.tutorial.project.Blue;
import com.tutorial.project.Color;
import com.tutorial.project.Green;
import com.tutorial.project.Red;
import com.tutorial.project.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      

		return null;
	}

	@Override
	public Shape getShap(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	}
