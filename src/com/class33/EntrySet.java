package com.class33;

import java.util.*;

public class EntrySet {
	
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> classroomMap = new LinkedHashMap<>();
		
		classroomMap.put("Table", 20);
		classroomMap.put("Chair", 60);
		classroomMap.put("Screen", 3);
		classroomMap.put("Student", 60);
		classroomMap.put("Instructor", 3);
		
		System.out.println("====== original Map=====");
		
		System.out.println(classroomMap);
		
		System.out.println("====== Using for loop =====");
		
		
		for(Map.Entry<String, Integer> entry: classroomMap.entrySet()) {
			
			System.out.println(entry.getKey()+": "+ entry.getValue());
			
		}
		
		System.out.println("====== Using Iterotor=====");
		
		Iterator<Map.Entry<String, Integer>> EntryIt= classroomMap.entrySet().iterator();
		
		
		while(EntryIt.hasNext()) {
			
			Map.Entry<String, Integer> Entry1= EntryIt.next();
			
			
			System.out.println(Entry1.getKey()+": "+Entry1.getValue());
		}
		
		
	}
	

}
