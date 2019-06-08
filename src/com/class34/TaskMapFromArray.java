package com.class34;


import java.util.*;

import com.class23.Employee;

public class TaskMapFromArray {

	
	public static void main(String[] args) {
		
		/*
		 
		 1.Create a Map from array of cities that will sort keys in alphabetical order.
		  
		 As a key store the name of the city and as a value store the length of the city name (Example: Paris=5, Moscow =6 etc..).
		 
		 If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).

		 2. Write a program to check which employee gets highest salary use hashmap employee name as key and salary amount as the value. Output example: John Smith=100000.
		 
		 */
		
		
		// Task 1;
		
		String[] cities= {"Istanbul","Paris","London","Newyork","Amsterdam","Madrid"};
		
		Map<String, Integer> city= new TreeMap<String, Integer>();
	
		
		for(String name: cities) {
			
			
			city.put(name, cities.length);
			
		}
		
		System.out.println(city);
		
		
		Iterator<Map.Entry<String, Integer>> it=city.entrySet().iterator();
		
			while(it.hasNext()) {
				
			Map.Entry<String,Integer> entry=it.next();
			if(entry.getValue()>7){
				it.remove();
			}
			
		}
		
		
		
		
		// Task 2;
		
		
		
		String [] employee= {"yunus", "mike", "ali", "Ahmet"};
		
		Map<String, Integer> Employee= new HashMap<String, Integer>();
		
		Scanner scan= new Scanner(System.in);
		
		;
		
		for(String name: employee) {
			
			System.out.println("Please enter your salary");
			
			int salary= scan.nextInt();
					
			Employee.put(name, salary);
				
			}
		
		int largest= Integer.MIN_VALUE;
		String key=null;
		
		Iterator<Map.Entry<String, Integer>> it1= Employee.entrySet().iterator();
		
		while(it1.hasNext()) {
			
		Map.Entry<String,Integer> entry=it1.next();
		
		if(entry.getValue()>largest) {
			
			largest= entry.getValue();
			key= entry.getKey();
			
		}
		
		}
		
		
		System.out.println(key+" is to whom takes the largerst salary in the company as "+largest);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
