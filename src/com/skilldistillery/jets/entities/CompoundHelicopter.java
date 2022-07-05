package com.skilldistillery.jets.entities;

public class CompoundHelicopter extends Jet implements CombatReady {
	
	public CompoundHelicopter(String type, String name, double speed, int range, long price) {
		super(type, name, speed, range, price);
		
	}
	public CompoundHelicopter() {
		super();
		
	}
	public void fly() {
		System.out.print(this.getClass().getSimpleName() + ": " + ", Model: " + getModelName() + "\nSpeed: " + getSpeedInMilesPerHour() + ", Range: "
				+ getRange() + ", Flight Time: ");
		System.out.printf("%.2f", ((getRange() / getSpeedInMilesPerHour())));
		System.out.print(" hours.");
		System.out.println("\nAirborne, Flying to Pandora!\n");
	}

	public void CombatReady() {
		System.out.println("Heading out to the fight!");
	}
	@Override
	public void fight() {
		System.out.println("I took out Pandora, I can take out Earth too!");
		
	}
	
	
}
