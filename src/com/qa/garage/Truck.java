package com.qa.garage;

public class Truck extends Vehicle {

	
	private int tonnage;
	private int length;
	
	

	public Truck(String colour, int numberOfWheels, boolean diesel, int iD, int tonnage, int length) {
		super(colour, numberOfWheels, diesel, iD);
		this.tonnage = tonnage;
		this.length = length;
	}



	public int getTonnage() {
		return tonnage;
	}



	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}
	
	
	@Override
	public void calcBill () {
		int totalBill = 150;
		totalBill += (tonnage * 8);
		
		boolean diesel = true;
		if (diesel  == true) {
			totalBill = totalBill*2;
		System.out.println("For the truck the bill is: ");
	}




	}
	
	
	
}
