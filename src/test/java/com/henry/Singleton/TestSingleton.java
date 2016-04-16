package com.henry.Singleton;

import org.junit.Test;

public class TestSingleton {
	@Test
	public void test() {
		ThreadSafeDoubleCheckLocking.getInstance();
	}
}
