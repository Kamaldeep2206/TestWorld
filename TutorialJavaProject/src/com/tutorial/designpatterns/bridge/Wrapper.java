package com.tutorial.designpatterns.bridge;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}
}