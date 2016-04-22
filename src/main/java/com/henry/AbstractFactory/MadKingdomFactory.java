package com.henry.AbstractFactory;

public class MadKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		return new MadCastle();
	}

	@Override
	public King createKing() {
		return new MadKing();
	}

	@Override
	public Army createArmy() {
		return new MadArmy();
	}
	
}
