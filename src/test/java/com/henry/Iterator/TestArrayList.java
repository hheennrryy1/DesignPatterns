package com.henry.Iterator;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestArrayList {
	Logger logger = Logger.getLogger(TestArrayList.class);
	@Test
	public void test() {
		ArrayList list = new ArrayList();
		for(int i=0; i<15; i++) {
			list.add(new People());
		}
		logger.info(list.size());
	}
}
