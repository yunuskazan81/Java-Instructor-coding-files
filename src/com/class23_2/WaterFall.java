package com.class23_2;

import com.class23.Employee;

public class WaterFall extends Employee{

	
	
public static void main(String[] args) {
		
		WaterFall wt=new WaterFall();
		
		wt.salary1=90000;// can access protected values from different package through inheritance
		//wt.salary;//default values cannot be access in different package
		
		wt.test();//available cause it is protected
		//wt.test1();NOT available cause it is default
	}
	
	
	
	
	
}
