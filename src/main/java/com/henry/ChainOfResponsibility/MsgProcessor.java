package com.henry.ChainOfResponsibility;

public class MsgProcessor {
	private String msg;
	private FilterChain filterChain;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}
	
	public String process() {
		return filterChain.doFilter(msg); 
	}
}
