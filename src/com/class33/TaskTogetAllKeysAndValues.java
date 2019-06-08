package com.class33;

import java.util.*;

public class TaskTogetAllKeysAndValues {

	public static void main(String[] args) {
		
		
		/*
		
		
		Create a map of countries with its capital. 
		Print all keys and values from a country map using for each loop and iterator.
		Print all values from a country map using for each loop and iterator.
		
		
		 */
		
		
		
		Map<String, String> map= new HashMap<>();
		
		
		map.put("Turkey", "Ankara");
		map.put("U.S", "Washington, DC.");
		map.put("Canada", "Toronto");
		map.put("UK", "London");
		map.put("Germany", "Berlin");
		map.put("Belgium", "Brussel");
		map.put("Fance", "Paris");
		
		Set<String> keys= map.keySet();
		
		
		for(String keylist: keys) {
			
			
			System.out.println(keylist);
			
		}
		
		
		System.out.println("------Using Iterotor to get both keys and value-----");
		
		
		Iterator<String> it= keys.iterator();
		
		while(it.hasNext()) {
		
		String Keys = it.next();
		
		System.out.println(Keys+": "+map.get(Keys));
		
		}
		System.out.println("----------All values---------");
		
		Collection<String> values=  map.values();
		
		
		for(String allvalues: values) {
			
			System.out.println(allvalues);
			
		}
		
		System.out.println("------Using Iterotor-----");
		
		Iterator<String> it1= values.iterator();
		
		while(it1.hasNext()) {
			
			String ALLval= it1.next();
			
			System.out.println(ALLval);
		
			
		}
		
		
	}

}
