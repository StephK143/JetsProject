package com.skilldistillery.jets.entities;

public class Passenger extends Jet implements CargoCarrier{
	
	public Passenger(String type, String name, double speed, int range, long price) {
		super(type, name, speed, range, price);
		
	}
	
	public Passenger(){
		super();
		
	}
	public void fly() {
		System.out.print(this.getClass().getSimpleName() + ": " + ", Model: " + getModelName() + "\nSpeed: " + getSpeedInMilesPerHour() + ", Range: "
				+ getRange() + ", Flight Time: ");
		System.out.printf("%.2f", ((getRange() / getSpeedInMilesPerHour())));
		System.out.print(" hours.");
		System.out.println("\nAirborne!!!\n");
	}

	@Override
	public void loadCargo() {
		
		System.out.println("This " + this.getClass().getSimpleName() + " jet can hold some cargo. Load it up!");
		
		
	}

}
