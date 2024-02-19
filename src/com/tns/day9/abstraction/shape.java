package com.tns.day9.abstraction;

public abstract class shape {
	protected float area;
	//abstract method
	abstract void calArea();
	
	//concrete method
	void show()
	{
		System.out.println("Area is :"+area);
	}

}
