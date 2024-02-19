package com.tns.day9.abstraction;

public class Square extends shape {
	private float side;
	

	public Square() {
		side= 4.0f;
	}

	public Square(float side) {
		super();
		this.side = side;
	}
	
	void calArea() {
		area = side * side;
	}

}
