package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		
		
		Garage garageList = new Garage();
		
		Car car1 = new Car("red", 4, false, 0, "Fiat", 2);
		Car car2 = new Car("black", 4, true, 1, "Skoda", 4);
		Motorbike motor1 = new Motorbike("green", 2, true, 2, 300, false);
		Truck truck1 = new Truck("white", 4, true, 3, 10, 8);
		
	
		garageList.addToGarage(car1);
		garageList.addToGarage(car2);
		garageList.addToGarage(motor1);
		garageList.addToGarage(truck1);
		
		
		garageList.listVehicles();
		
		System.out.println(garageList.garageList);
		garageList.removeFromGarage(motor1);

		garageList.removeVehicles();
		System.out.println(garageList.garageList);
		
		Car.calcBill(car1);
		
		
	}
	
	
}
