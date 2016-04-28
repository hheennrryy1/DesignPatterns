package com.henry.ChainOfResponsibility;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		str = str.replace('习', '*');
		return str;
	}
	
}
