package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String typeOfJet;
	private String modelName;
	private double speedInMilesPerHour;
	private double speedInMach = speedInMilesPerHour * 0.001303;
	private int range;
	private long price;

	public Jet() {
		

	}

	public Jet(String typeOfJet, String name, double speed, int range, long price) {
		super();
		this.typeOfJet = typeOfJet;
		this.modelName = name;
		this.speedInMilesPerHour = speed;
		this.range = range;
		this.price = price;
	}

	public String getTypeOfJet() {
		return typeOfJet;
	}

	public void setTypeOfJet(String typeOfJet) {
		this.typeOfJet = typeOfJet;
	}

	public double getSpeedInMach() {
		return speedInMach;
	}

	public void setSpeedInMach(double speedInMach) {
		this.speedInMach = speedInMach;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String name) {
		this.modelName = name;
	}

	public double getSpeedInMilesPerHour() {
		return speedInMilesPerHour;
	}

	public void setSpeedInMilesPerHour(double speedInMilesPerHour) {
		this.speedInMilesPerHour = speedInMilesPerHour;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	
	
	public abstract void fly();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("This ").append(typeOfJet).append(" jet ").append(modelName).append(" has a speed of ")
				.append(speedInMilesPerHour).append(" miles per hour.").append("! It can go ").append(range)
				.append(" before it needs fuel. It's a bargain at just ").append(price).append("!!");

		return builder.toString();
	}

	

	

}
