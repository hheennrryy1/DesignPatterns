package com.henry.ChainOfResponsibility;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestChain {
	
	Logger logger = Logger.getLogger(TestChain.class);
	
	@Test
	public void test() {
		String msg = "学习<>";
		MsgProcessor msgProcessor = new MsgProcessor();
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new HTMLFilter());
		filterChain.addFilter(new SensitiveFilter());
		msgProcessor.setFilterChain(filterChain);
		msgProcessor.setMsg(msg);
		String result = msgProcessor.process();
		logger.info(result);
	}
}
