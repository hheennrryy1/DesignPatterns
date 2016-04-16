package com.henry.Singleton;

/**
 * double-checked locking
 * @author henry
 *
 */
		
public class ThreadSafeDoubleCheckLocking {
	/*
	 * Volatile���εĳ�Ա������ÿ�α��̷߳���ʱ����ǿ�ȴӹ����ڴ����ض��ó�Ա������ֵ�����ң�����Ա���������仯ʱ��
	 * ǿ���߳̽��仯ֵ��д�������ڴ档�������κ�ʱ�̣�������ͬ���߳����ǿ���ĳ����Ա������ͬһ��ֵ��
	 */
	
	private volatile static ThreadSafeDoubleCheckLocking instance;
	
	private ThreadSafeDoubleCheckLocking(){};
	
	public static ThreadSafeDoubleCheckLocking getInstance() {
		if(instance==null) {
			synchronized(ThreadSafeDoubleCheckLocking.class) {
				if(instance==null) {
					instance = new ThreadSafeDoubleCheckLocking();
				}
			}
		}
		return instance;
	}
}
