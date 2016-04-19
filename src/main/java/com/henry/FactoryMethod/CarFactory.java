package com.henry.FactoryMethod;

public class CarFactory implements VehicleFactory {

	@Override
	public Moveable create() {
		return new Car();
	}

}
