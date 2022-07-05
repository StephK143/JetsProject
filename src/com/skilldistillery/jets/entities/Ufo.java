package com.skilldistillery.jets.entities;

public class Ufo extends Jet implements CombatReady {

	public Ufo(String type, String name, double speed, int range, long price) {
		super(type, name, speed, range, price);
	}

	public Ufo() {
		super();
	}

	public void ufoSays() {
		System.out.println("You can't tell me what to do, I will destroy your planet!");
	}

	public void fly() {
		System.out.print(this.getClass().getSimpleName() + ": " + ", Model: " + getModelName() + "\nSpeed: "
				+ getSpeedInMilesPerHour() + ", Range: " + getRange() + ", Flight Time: ");
		System.out.printf("%.2f", ((getRange() / getSpeedInMilesPerHour())));
		System.out.print(" hours.");
		System.out.println("\nAirborne and ready to take over the World!\n");
	}

	@Override
	public void fight() {
		System.out.println("I'm the alien in the DeathStar! Would you like me to take out the whole planet or just the bad guys...haha!!");

	}

}
