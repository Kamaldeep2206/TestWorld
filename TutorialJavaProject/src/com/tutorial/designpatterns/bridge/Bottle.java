package com.tutorial.designpatterns.bridge;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}
