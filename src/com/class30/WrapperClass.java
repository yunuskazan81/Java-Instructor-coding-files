package com.class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer integer1=new Integer(10);//Boxing
		
		System.out.println(integer1);
		
		Integer integer2=10;//AutoBoxing
		
		int num=integer1.intValue();//Unboxing
		System.out.println(num);
		
		int num2=integer2;//AutoUnboxing
		
		String number= "Kazan is My lastname";
		// String name1= String.valueOf(number);
		
		String name1= number;
		
		System.out.println(name1);
		
	}
}

