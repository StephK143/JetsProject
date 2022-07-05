package com.skilldistillery.jets.entities;

public class JetImpl  extends Jet  {

	public JetImpl() {
		super();
	}
	
	public JetImpl(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	@Override
	public void fly() {
	
		
	}
}
