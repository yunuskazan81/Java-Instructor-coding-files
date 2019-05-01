package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	/*
	
	1.Create an arraylist of cars and retrieve all the values using 4 different ways.

2.Create an arrayList of words. Remove every word that ends with “e”.

3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.
	
	 */
	
	
	
	private static final String Iteriator = null;

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Toyota Camry");
		cars.add("Toyota Corolla");
		cars.add("Honda Accord");
		cars.add("Honda Civic");
		cars.add("Audi Q7");
		cars.add("BMV");
		
		System.out.println("-----  for loop--------");
		
		for (int i=0; i<cars.size(); i++) {
			
			System.out.println(cars.get(i));
			
		}
		
		System.out.println("-----  Advance for loop--------");
		
		for (Object newlist: cars) {
			
			System.out.println(newlist);
		}
		
		
		System.out.println("-----  Iterator--------");
		
		Iterator<String> it= cars.iterator();
		
		while (it.hasNext()) {
			
			String CarName= it.next();
			
			System.out.println(CarName);
			
		}
		
		System.out.println("-----  While loop--------");
		
		int a= 0;
		
		
		while (cars.size()>a) {
			
			System.out.println(cars.get(a));
			
			a++;
			
		}
		
		System.out.println("-----  EndsWith (e)--------");
		
		ArrayList<String> words= new ArrayList<String>();
		
		
		words.add("Jane");
		words.add("Apple");
		words.add("Employee");
		words.add("talking");
		words.add("Jackie");
		words.add("Works");
		words.add("yunus");
		words.add("Jonah");
		
		
Iterator<String> Word= words.iterator();
		
		while (Word.hasNext()) {
			
			String WordList= Word.next();
		
			
			if(WordList.endsWith("e")) {
				
				Word.remove();
				
				// System.out.println(words);
				
				}
			
			
			} System.out.println(words);
			
			
		
			
			
			ArrayList<String> drinks= new ArrayList<String>();
			
			
			drinks.add("yunus");
			drinks.add("Vodka");
			drinks.add("RedBull");
			drinks.add("Wine");
			drinks.add("ApplEJuicE");
			drinks.add("Orange Juice");
			drinks.add("Margarita");
			drinks.add("Sex on the beach");
			

				for (int i=0; i<drinks.size(); i++) {
					
					String str= drinks.get(i);
					
					str.toUpperCase();
					
					System.out.println(str);
				
				if(str.contains("e") || str.contains("a") || str.contains("E") || str.contains("A")){
					
					// drinks.remove(i);
					
					drinks.set(i, "water");
					
					// System.out.println(words);
					
					}
			}
				
		System.out.println(drinks);	
			
			
	}
	
	
}
