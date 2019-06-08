package com.class36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		
		
	int a = 0;
	Scanner scan= new Scanner(System.in);
	
	System.out.println("enter number");
		
		try {a= scan.nextInt(); System.out.println(a);}
		
		catch(ArithmeticException e){
			
			System.out.println("please enter integer value");
		}
		
		finally {
			
			System.out.println("please eneter integer value");
		}
		
	}

}
