package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class classTask {
	
	
	/*
Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
	 */

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("please enter first number");

		//a= scan.nextInt();
		
//		System.out.println("please enter first number");
//
//		b= scan.nextInt();
	
			
		
		try { a= scan.nextInt(); System.out.println(a);}
		
		catch(InputMismatchException e) {
			
			System.out.println("please enter integer number");
			
		}
		
		
			
	
	
	} 

}
