package com.henry.Singleton;

/**
 * 
 * @author henry
 *	懒汉式单例
 */
public class LazySingleton {
	
	private static LazySingleton singleton;
	
	private LazySingleton(){};
	
	/**
	 * 不加synchronized，多线程可能产生多个实例，但加了只有第一次执行此方法时有用。
	 * 1. 如果getInstan()的性能对应用不是很关键，就什么都别做。
	 * 2. 改用饿汉式单例。
	 * 3. 用双重检查加锁。
	 * @return
	 */
	public static synchronized LazySingleton getInstance() {
		if(singleton==null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
