package com.henry.Singleton;

/**
 * 
 * @author henry
 * ����ʽ����
 */
public class EagerSingleton {
	
	private static EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton(){};
	
	public static EagerSingleton getInstance() {
		return singleton;
	}
	
}
