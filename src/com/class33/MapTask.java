package com.class33;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
		
		
		/*
		 
		 
Create a map of a building. Store floor number and it is associated company name. 
(Example: 1= Google, 2=Syntax etc..). 
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
		 
		 
		 */
		
		
		Map<Integer, String> map = new HashMap<>();
		
		
		map.put(1, "Google");
		map.put(2, "Apple");
		map.put(3, "Twitter");
		map.put(4, "FaceBook");
		map.put(5, "IBM");
		map.put(6, "AMD");
		map.put(7, "NVIDIA");
		map.put(8, "INTEL");
		map.put(9, "AMAZON");
		map.put(10, "Google");
		map.put(1, "NETFLIX");
		map.put(11, "AMAZON");
		
		System.out.println(map.size());
		
		map.replace(4, "Windows");
		
		System.out.println(map);
		
		map.remove(7);
		
		System.out.println(map);
		
		System.out.println(map.size());
	}

}
