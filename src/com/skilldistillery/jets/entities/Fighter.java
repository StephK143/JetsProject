package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady {

	public Fighter(String type, String name, double speed, int range, long price) {
		super(type, name, speed, range, price);
	}

	public Fighter(String name, double speed, int range, long price) {
	}

	public Fighter() {
		super();
	}

	public void fly() {
		System.out.print(this.getClass().getSimpleName() + ": " + ", Model: " + getModelName() + "\nSpeed: "
				+ getSpeedInMilesPerHour() + ", Range: " + getRange() + ", Flight Time: ");
		System.out.printf("%.2f", ((getRange() / getSpeedInMilesPerHour())));
		System.out.print(" hours.");
		System.out.println("\nAirborne and ready to fight!\n");
	}

	public void fight() {
		System.out.println("I'm a fighter jet! Charge!! Pewm, Pewm");

	}

}
