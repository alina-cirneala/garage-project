package com.qa.garage;

import java.util.ArrayList;


public class Garage {

	
	ArrayList<Vehicle> garageList = new ArrayList<>();
	
	public void addToGarage(Vehicle vehicle) {
		garageList.add(vehicle);
		System.out.println(vehicle.getID() + " has been added to the garage!");
	}
	
	public void removeFromGarage(Vehicle vehicle) {
		garageList.remove(vehicle);
		System.out.println(vehicle.getID()+ " has been taken out of the garage.");
	}
	
	
	
	public void listVehicles () {
		for (Vehicle vehicle : garageList) {
			System.out.println(vehicle.getID());
		}
	}
	
	
	public void removeVehicles () {
	 garageList.clear();
}

	
	public void billPrice () {
	for (Vehicle calcBill : garageList) {
		System.out.println("The bill is " + calcBill);
	}
	
	}

}
