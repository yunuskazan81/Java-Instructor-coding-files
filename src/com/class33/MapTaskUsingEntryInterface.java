package com.class33;

import java.util.*;
import java.util.Map.Entry;

//import java.util.Map.Entry;

public class MapTaskUsingEntryInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		
		Create a map of Best Buy store. Place
		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		Print all keys and values from a Best Buy map using EntrySet.
		
		
		*/
		 // we have to pass reference variable type like Map<Integer, String> if we use for each loop, 
		
		Map<Integer,String> BestBuyMap= new LinkedHashMap<Integer, String>();
		
		
		BestBuyMap.put(76664847, " Printer");
		BestBuyMap.put(76663454, " Dell Laptop");
		BestBuyMap.put(76674367, " TV");
		BestBuyMap.put(52664847, " Scanner");
		BestBuyMap.put(77434847, " Cartridge");
		BestBuyMap.put(76637262, " Samsung PC");
		BestBuyMap.put(24666484, " Apple Mouse");
		BestBuyMap.put(44848509, " Iphone X Max");
		
		System.out.println("original Map");
		
		System.out.println("\n"+BestBuyMap+"\n");
		
		System.out.println("\n====== Using for loop =====\n");
		
		for(Map.Entry<Integer, String> newMap: BestBuyMap.entrySet()) {
			
			System.out.println(newMap.getKey()+" :"+ newMap.getValue());
			
		}
			
			System.out.println("\n====== Using Iterotor=====\n");
			
			Iterator<Map.Entry<Integer, String>> EntryIt= BestBuyMap.entrySet().iterator();
			
			
			while(EntryIt.hasNext()) {
				
				Map.Entry<Integer, String> Entry= EntryIt.next();
				
				
				System.out.println(Entry.getKey()+": "+Entry.getValue());
			}
			
			
			// we can skip passing type for map so making non-generic like Map BestBuyMap2= new LinkedHashMap (); or LinkedHashMap<> ();
			// or Map BestBuyMap2= new LinkedHashMap<Integer, String> ();
			
									//<Integer, String> ---> we can also put this;
			Map BestBuyMap2= new LinkedHashMap<> ();
			
			
			BestBuyMap2.put(76664847, " Printer");
			BestBuyMap2.put(76663454, " Dell Laptop");
			BestBuyMap2.put(76674367, " TV");
			BestBuyMap2.put(52664847, " Scanner");
			BestBuyMap2.put(77434847, " Cartridge");
			BestBuyMap2.put(76637262, " Samsung PC");
			BestBuyMap2.put(24666484, " Apple Mouse");
			BestBuyMap2.put(44848509, " Iphone X Max");
			
			System.out.println("\noriginal Map\n");
			
			System.out.println("\n"+BestBuyMap2+"\n");
			
			System.out.println("\n====== Using for loop =====\n");
			
			//for(Map.Entry<Integer, String> newMap: BestBuyMap.entrySet()) {
				
			//	System.out.println(newMap.getKey()+" :"+ newMap.getValue());
				
			//}
				
				System.out.println("\n====== Using Iterotor=====\n");
						// we can also make non-generic Iterator<Map.Entry> ENtryIt= BestBuyMap2.entrySet().iterator(); ---> if we use iterator.
				Iterator<Map.Entry<Integer, String>> Entryit= BestBuyMap2.entrySet().iterator();
				
				
				while(Entryit.hasNext()) {
					// we can make non-generic Map.Entry ENtry= ENtryIt.next();  ---> if we use iterator;
					Map.Entry<Integer, String> Entri= Entryit.next();
					
					
					System.out.println(Entri.getKey()+": "+Entri.getValue());
				}
					
			
			
		
		
		// another way to create map with object parameterized
		
		System.out.println("\n another way to create map with object parameterized\n");
		
	// we can pass variable types as an object which is a parent and cover all	type of class entire java; 
	// we do not have to pay attention about type of variable if we pass object. easy way!!!
		
Map <Object, Object> BestBuyMap1= new LinkedHashMap<>();
		
		
		BestBuyMap1.put(76664847, " Printer");
		BestBuyMap1.put(76663454, " Dell Laptop");
		BestBuyMap1.put(76674367, " TV");
		BestBuyMap1.put(52664847, " Scanner");
		BestBuyMap1.put(77434847, " Cartridge");
		BestBuyMap1.put(76637262, " Samsung PC");
		BestBuyMap1.put(24666484, " Apple Mouse");
		BestBuyMap1.put(44848509, " Iphone X Max");
		
		System.out.println("original Map");
		
		System.out.println("\n"+BestBuyMap1+"\n");
		
		System.out.println("\n====== Using for loop =====\n");
		
		for(Map.Entry<Object, Object> newMap: BestBuyMap1.entrySet()) {
			
			System.out.println(newMap.getKey()+" :"+ newMap.getValue());
			
			
		}
		
		System.out.println("\n====== Using Iterotor=====\n");
						
		Iterator<Entry<Object, Object>> entryIt= BestBuyMap1.entrySet().iterator();
		
		
		while(entryIt.hasNext()) {
			
			Map.Entry<Object, Object> entry1= entryIt.next(); 
			
			
			System.out.println(entry1.getKey()+": "+entry1.getValue());
		}
		
		
		

	}

}
