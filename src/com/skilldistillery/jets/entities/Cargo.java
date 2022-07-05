package com.skilldistillery.jets.entities;

public class Cargo extends Jet implements CargoCarrier {

	public Cargo(String type, String name, double speed, int range, long price) {
		super(type, name, speed, range, price);
	}

	public Cargo() {

	}

	@Override
	public void loadCargo() {
		System.out.println("Loading cargo for " + this.getModelName());
	}

	public void fly() {
		System.out.print(this.getClass().getSimpleName() + ": " + ", Model: " + getModelName() + "\nSpeed: "
				+ getSpeedInMilesPerHour() + ", Range: " + getRange() + ", Flight Time: ");
		System.out.printf("%.2f", ((getRange() / getSpeedInMilesPerHour())));
		System.out.print(" hours.");
		System.out.println("\nAirborne but slow!\n");

	}
}
