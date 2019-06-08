package com.class36;

public class stringBuilder extends StringIsImmutable {
	
	 static int a=10;
	 
	public static void main(String[] args) {
		
		stringBuilder obj= new stringBuilder();
		String s = "responses";
		System.out.println(s);
	
		
		StringBuilder builder = new StringBuilder(s);
		System.out.println(builder.reverse());

		
	}

	}
