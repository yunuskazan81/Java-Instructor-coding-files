package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		
		
		Insurance insurance1= new Car("Geico", "Car Insurance");
		
		
		Insurance insurance2= new Pet("ALlState", "Pet Insurance");
		
		
		Insurance insurance3 = new Health("Aetna", "Health Insurance");
		
		
		
		ArrayList<Insurance> alist = new ArrayList<>();
		
		
		alist.add(insurance1);
		
		alist.add(insurance2);
		alist.add(insurance3);
		
		for (int i=0; i<alist.size(); i++ ) {
			
			
			System.out.println(alist.get(i).InsuranceName);
			//System.out.println(alist.get(i).insuranceType);
			
			
		} 
		
		for (Insurance ins: alist) {
			
			ins.cancelInsurance(true);
			
		}
		
		Iterator<Insurance> it= alist.iterator();
		
		while(it.hasNext()) {
			
			Insurance insurance= it.next();
			
			
			insurance.getQuote();
			
			//Insurance obj= it.next();
			
			//System.out.println(insurance.typeofInsurance(insurance.insuranceType));
			
		}
		
Iterator<Insurance> it1= alist.iterator();
		
		while(it1.hasNext()) {
			
			Insurance obj= it1.next();
			
			
			System.out.println(obj.typeofInsurance(obj.insuranceType));
			
		}
	}
	
}
