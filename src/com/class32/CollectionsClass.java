package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
		
		
		
		ArrayList<Integer> integerList=new ArrayList<>();
		integerList.add(90);
		integerList.add(33);
		integerList.add(56);
		integerList.add(1000);
		
		System.out.println("Collection before sorting "+integerList); 
		Collections.sort(integerList);//class that works with collections(LIST, SET, QUEUE);
		System.out.println("Collection after sorting "+integerList);
	
		
		Object[] objectArray= {true, "John", 123, 123490.5, 784809945384595345l, 534583.75f,'A'};// Object class covers all class in java programming,
		
		System.out.println(objectArray[0]);
		
		int[] integerArray= {12,57,9799,1};
		
		Arrays.sort(integerArray);//This class contains various methods for manipulating arrays
		System.out.println("Array after sorting");
		
		for(int num: integerArray) {
			System.out.print(num+" ");
		}
	}
}