package com.henry.Facade;

import org.junit.Test;

public class TestFacade {
	@Test
	public void test() {
		ShapeFacade shapeFacade = new ShapeFacade();
		shapeFacade.drawCircle();
		shapeFacade.drawSquare();
		shapeFacade.drawTriangle();
	}
}
