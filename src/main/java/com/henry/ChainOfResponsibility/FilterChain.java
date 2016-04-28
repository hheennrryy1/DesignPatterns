package com.henry.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	
	List<Filter> filters = new ArrayList<>();
	
	public void addFilter(Filter filter) {
		filters.add(filter);
	}
	
	@Override
	public String doFilter(String str) {
		String s = str;
		for(Filter f : filters) {
			s = f.doFilter(s);
		}
		return s;
	}
}
