package com.tnsif.day6staticVariable;

public class employee {
	private String name;
	private int id;
	//declaring static variable for company name
	static String Companyname = "TNS";

	public employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + "]";
	}
	

	
	
	

}
