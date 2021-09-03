package com.qa.garage;

public class Motorbike extends Vehicle {

	private int speed;
	private boolean dangerous;
	
	
	
	public Motorbike(String colour, int numberOfWheels, boolean diesel, int iD, int speed, boolean dangerous) {
		super(colour, numberOfWheels, diesel, iD);
		this.speed = speed;
		this.dangerous = dangerous;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public boolean isDangerous() {
		return dangerous;
	}



	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}
	
	
	@Override
	public void calcBill () {
		int totalBill = 0;
		totalBill += (speed * 5);
		
		boolean diesel = true;
		if (diesel == true) {
			totalBill = totalBill*2;
		System.out.println("For the motorbike the bill is: ");
	}

	}

	
	
}
