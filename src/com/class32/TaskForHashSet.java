package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskForHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

		2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.

		3. Create an HashSet of cities and add duplicates into it.
		    Retrieve all values from hashset in 2 different ways.
		    Retrieve all values in alphabetical order.
		    
		4. Also MUST look over Map interface and HashMap class.
*/
		
		
		
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		list.add("Books");
		list.add("Bikes");
		list.add("Newspapers");
		list.add("Electronics");
		list.add("Foods");
		list.add("Cleanings");
		
		
		Collections.sort(list);
		
		System.out.println("After sorting of the arraylist: "+ list);
		
		
		
		
		String [] arraylist= {"john", "mike","jane","jonah"};
		
		Arrays.sort(arraylist);
		
		System.out.println("after sorting of the array: "+ arraylist);
		
	}

}
