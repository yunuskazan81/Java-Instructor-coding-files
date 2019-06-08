package com.class32;

public abstract class Insurance1 {
	public String insuranceName;

	public Insurance1(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();
	public abstract void cancelInsurance();
}
class CarInsurance extends Insurance1 {
    public String model;

    public CarInsurance(String insuranceName, String model) {
        super(insuranceName);
        this.model=model;
    }
    @Override
    public void getQuote() {
        System.out.println("This is quote for " + insuranceName + " and " + model);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ insuranceName + " and " + model);
    }
}

class HealthInsurance extends Insurance1 {
    public HealthInsurance(String insuranceName) {
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println("This is quote for " + insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ insuranceName );
    }
}
class PetInsurance extends Insurance1 {
    public String petType;
    public PetInsurance(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("This is quote for " + insuranceName + " and " + petType);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ insuranceName + " and " + petType);
    }
}