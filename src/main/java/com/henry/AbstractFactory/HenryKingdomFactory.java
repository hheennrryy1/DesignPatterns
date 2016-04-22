package com.henry.AbstractFactory;

public class HenryKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		return new HenryCastle();
	}

	@Override
	public King createKing() {
		return new HenryKing();
	}

	@Override
	public Army createArmy() {
		return new HenryArmy();
	}
	
}
