package com.henry.AbstractFactory;

public class HenryCastle implements Castle {
	
	String description = "This is HenryCastle";
	
	@Override
	public String getDescription() {
		return description;
	}
	
}
