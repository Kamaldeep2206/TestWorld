package com.tutorial.designpatterns.bridge;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
