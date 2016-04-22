package com.henry.AbstractFactory;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestAbstractFactory {
	
	Logger logger = Logger.getLogger(TestAbstractFactory.class);
	
	@Test
	public void test() {
		//KingdomFactory factory = new HenryKingdomFactory();
		KingdomFactory factory = new MadKingdomFactory();
		King king = factory.createKing();
		Castle castle = factory.createCastle();
		Army army = factory.createArmy();
		logger.info(king.getDescription() + "|" + castle.getDescription() + "|" + army.getDescription());
	}
}
