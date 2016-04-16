package com.henry.Singleton;

/**
 * 
 * @author henry
 * ¶öººÊ½µ¥Àý
 */
public class EagerSingleton {
	
	private static EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton(){};
	
	public static EagerSingleton getInstance() {
		return singleton;
	}
	
}
