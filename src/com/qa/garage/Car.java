package com.qa.garage;

public class Car extends Vehicle {

	private String brand;
	private int numberOfDoors;
	
	

	public Car(String colour, int numberOfWheels, boolean diesel, int iD, String brand, int numberOfDoors) {
		super(colour, numberOfWheels, diesel, iD);
		this.brand = brand;
		this.numberOfDoors = numberOfDoors;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getNumberOfDoors() {
		return numberOfDoors;
	}



	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	@Override
	public void calcBill () {
		int totalBill = 0;
		totalBill += (numberOfDoors * 3);
		
		boolean diesel = true;
		if (diesel == true) {
			totalBill = totalBill*2;
		System.out.println("For the car the bill is: ");
	}
	
	}
	
}
