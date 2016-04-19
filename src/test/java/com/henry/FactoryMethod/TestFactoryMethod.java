package com.henry.FactoryMethod;

import org.junit.Test;

public class TestFactoryMethod {
	
	@Test
	public void test() {
		//VehicleFactory factory = new CarFactory();
		VehicleFactory factory = new PlaneFactory();
		Moveable moveable = factory.create();
		moveable.run();
	}
}
