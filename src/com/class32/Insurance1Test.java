package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Insurance1Test {

	public static void main(String[] args) {
		
		Insurance1 obj=new CarInsurance("Geico", "Toyota");
		Insurance1 obj2=new PetInsurance("Progressive", "Dog");
		Insurance1 obj3=new HealthInsurance("Kaiser");
		
		List<Insurance1> insList=new ArrayList<>();
		insList.add(obj);
		insList.add(obj2);
		insList.add(obj3);
		//for loop
		for (int i=0; i<insList.size(); i++) {
			System.out.println(insList.get(i).insuranceName);
		}
		//advance for loop
		for(Insurance1 ins:insList) {
			ins.getQuote();
		}
		//iterator
		Iterator<Insurance1> it=insList.iterator();
		while(it.hasNext()) {
			it.next().cancelInsurance();
		}
	}
}
