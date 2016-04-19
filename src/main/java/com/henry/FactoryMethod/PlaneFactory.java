package com.henry.FactoryMethod;

public class PlaneFactory implements VehicleFactory{

	@Override
	public Moveable create() {
		return new Plane();
	}
	
}
