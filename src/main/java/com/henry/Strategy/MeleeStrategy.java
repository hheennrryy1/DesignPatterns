package com.henry.Strategy;

public class MeleeStrategy implements DragonSlayerStrategy {

	@Override
	public void execute() {
		System.out.println("MeleeStrategy works");
	}
	
}
