package com.henry.AbstractFactory;

public class MadKing implements King {
	
	String description = "This is MadKing";
	
	@Override
	public String getDescription() {
		return description;
	}

}
