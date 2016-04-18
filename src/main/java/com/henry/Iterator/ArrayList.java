package com.henry.Iterator;
/**
 * 
 * @author henry
 * ¼òµ¥Ä£·ÂJDKµÄArrayList
 */
public class ArrayList implements Collection {
	Object[] objects = new Object[10];
	int index = 0;
	
	@Override
	public void add(Object o) {
		if(index==objects.length) {
			objects = new Object[index*2];
		}
		objects[index] = o;
		index++;
	}
	
	@Override
	public int size() {
		return index;
	}

	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	
	public class ArrayListIterator implements Iterator{

		@Override
		public Object next() {
			return objects[index+1];
		}

		@Override
		public boolean hasNext() {
			if(index>=objects.length) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
}	
