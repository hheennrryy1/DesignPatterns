package com.henry.Strategy;

public class DragonSlayer {
	DragonSlayerStrategy strategy;
	
	public DragonSlayer(DragonSlayerStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void changeStrategy(DragonSlayerStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute() {
		strategy.execute();
	}
}
