package com.henry.Iterator;
/**
 * 
 * @author henry
 * ��ģ��JDK��ArrayList
 */
public class ArrayList {
	Object[] objects = new Object[10];
	int index = 0;
	
	public void add(Object o) {
		if(index==objects.length) {
			objects = new Object[index*2];
		}
		objects[index] = o;
		index++;
	}
	
	public int size() {
		return index;
	}
}	
