package com.tnsif.day6staticVariable;

public class employee_demo {

	public static void main(String[] args) {
		System.out.println(employee.Companyname);
		employee emp = new employee("cibi",123456);
		System.out.println(emp);
		
		
		//similarly create another object for same class and pass the parameters
		 emp = new employee("ayub",123);
		System.out.println(emp);

	}

}
