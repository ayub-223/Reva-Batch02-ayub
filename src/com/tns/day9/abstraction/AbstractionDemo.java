package com.tns.day9.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		shape sh ;
		sh = new Rectangle();
		sh.calArea();
		sh.show();
		
		sh = new Square();
		sh.calArea();
		sh.show();
		
		Square sq = new Square();
		sq.calArea();
		sq.show();
		
		Rectangle re = new Rectangle();
		re.calArea();
		re.show();

	}

}
