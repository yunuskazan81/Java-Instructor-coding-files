package com.class36;

import java.util.Scanner;

public class TaskLargerBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String take= "hi";


take.toUpperCase();


String str= "hello";

 str= "hi";
 
 System.out.println(str);


System.out.println(take);

		int limit;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("please enter amount");
		
		limit = scan.nextInt();
		
		
		if (limit<=500) {
			
			System.out.println("please take your money");
			
		}
		
		else {
			
			throw new ArithmeticException("please enter amount smaller than 500");
			
		}
	}

}
