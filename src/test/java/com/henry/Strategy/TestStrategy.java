package com.henry.Strategy;

import org.junit.Test;

public class TestStrategy {
	
	@Test
	public void test() {
		DragonSlayer d = new DragonSlayer(new MeleeStrategy());
		d.execute();
		
		DragonSlayer ds = new DragonSlayer(new SpellStrategy());
		ds.execute();
	}
}
