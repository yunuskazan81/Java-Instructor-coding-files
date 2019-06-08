package com.class34;

import java.util.*;
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Map<Integer,Person>  EmployeeList = new HashMap<>();
		
		
		EmployeeList.put(1, new Person("Yunus", "Kazan", 32, 90000));
		EmployeeList.put(2, new Person("mike", "McKenzie", 35, 80000));
		EmployeeList.put(2, new Person("mike", "McKenzie", 35, 80000));
		EmployeeList.put(2, new Person("mike", "McKenzie", 35, 80000));
		EmployeeList.put(2, new Person("mike", "McKenzie", 35, 80000));
		

		Collection<Person> person=EmployeeList.values();
		for(Person human:person) {
			human.userDetailes();
		}
	}

}
