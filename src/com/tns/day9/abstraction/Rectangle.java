package com.tns.day9.abstraction;

public class Rectangle extends shape {
	private float width,height;

	public Rectangle() {
		width =2.8f;
		height = 4.5f;
	}

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	void calArea() {
		area = width * height;
	}
	
	

}
