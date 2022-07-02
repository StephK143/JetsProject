package com.skilldistillery.jets.entities;

public abstract class Jet {
	String modelName = "Jet";
	double speedInMilesPerHour = 0.0;
    int range = 0;
    long price = 0;
    
	public void Jet(String name, double speed, int range, long price) {
		
	}
	
	public void flyJet() {
	}
	
	public double getSpeedInMach() {
		double mphSpeed = 0.0;
		double machSpeed = mphSpeed * 0.001303;
		
		return machSpeed;
	}

}
