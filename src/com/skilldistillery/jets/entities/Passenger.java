package com.skilldistillery.jets.entities;

public class Passenger extends Jet{
	
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

}
