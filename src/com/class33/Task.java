package com.class33;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Task {

	public static void main(String[] args) {
		
		
		/*
		
		
		How can you remove all duplicates from ArrayList?

		List<String> aList=new ArrayList<String>();
		
        aList.add(“John”);
        aList.add(“Jane”);
        aList.add(“James”);
        aList.add(“Jasmine”);
        aList.add(“Jane”);
        aList.add(“James”);
		
		
		
		
		 */
		
List<String> aList=new ArrayList<String>();
		
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        
        
        Set <String> newlist= new LinkedHashSet<String>(aList);
        
        
		System.out.println(newlist);
		

	}

}
