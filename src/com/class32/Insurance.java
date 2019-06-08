package com.class32;

public abstract class Insurance {

	/*
	Create a class Insurance 
	that will have an attribute as insuranceName and unimplemented behaviour 
	as getQuote and cancelInsurance. 
	Create 3 subclasses Car, Pet, Health. 
	Car class has it’s own attribute as carModel and Class Pet has petType attribute.
	Create 3 objects of the sub classes and store them in ArrayList. Using 1 reference variable access methods from different classes.
	
	*/
	public String insuranceType;
	public String InsuranceName;
	
	public abstract void getQuote();
	
	public abstract void cancelInsurance(boolean cancelOption);
	public abstract String typeofInsurance(String type);
	
	
	public Insurance(String InsuranceName, String insuranceType) {
		
		this.InsuranceName= InsuranceName;
		this.insuranceType= insuranceType;
		//System.out.println(InsuranceName);
	}
	
	
}


class Car extends Insurance{

	public Car(String Insurance, String insuranceType) {
		super(Insurance, insuranceType);
	
	}

	@Override
	public void getQuote() {
		
		System.out.println("you can get quote for free");
	}

	@Override
	public void cancelInsurance(boolean cancelOption) {
		
		System.out.println("You can cancel your "+ InsuranceName +" "+ insuranceType+ " plan anytime it's "+cancelOption);	
	}
	

	@Override
	public String typeofInsurance(String insuranceType) {
		
		return insuranceType;
	}
	
	
}

class Pet extends Insurance {

	public Pet(String InsuranceName, String insuranceType) {
		super(InsuranceName, insuranceType);
		
	}

	@Override
	public void getQuote() {
		
		System.out.println("you can get quote for $50");
	}

	@Override
	public void cancelInsurance(boolean cancelOption) {
		
		System.out.println("You can cancel your "+ InsuranceName +" "+ insuranceType+ " plan anytime it's "+cancelOption);
	}
	


	@Override
	public String typeofInsurance(String insuranceType) {
		
		return insuranceType;
	}
	
}

class Health extends Insurance{

	public Health(String InsuranceName, String insuranceType) {
		super(InsuranceName, insuranceType);
		
	}

	@Override
	public void getQuote() {
		
		System.out.println("you can get quote for free");
	}

	@Override
	public void cancelInsurance(boolean cancelOption) {
		
		System.out.println("You can cancel your "+ InsuranceName +" "+ insuranceType+ " plan anytime it's "+cancelOption);
	}

	@Override
	public String typeofInsurance(String insuranceType) {
		
		return insuranceType;
	}
	
}
