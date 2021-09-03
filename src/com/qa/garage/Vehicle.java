package com.qa.garage;

public class Vehicle {

	private String colour;
	private int numberOfWheels;
	private boolean diesel; 
	
	private int ID;

	public Vehicle(String colour, int numberOfWheels, boolean diesel, int iD) {
		super();
		this.colour = colour;
		this.numberOfWheels = numberOfWheels;
		this.diesel = diesel;
		ID = iD;
	}

	
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isDiesel() {
		return diesel;
	}

	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	public void calcBill () {
		int totalBill = 0;
		totalBill += (numberOfWheels * 5);
		
		if (diesel == true) {
			totalBill = totalBill*2;
			System.out.println("The price of the bill is: " + totalBill);
		}
	}
	
	
}
