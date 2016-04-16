package com.henry.Singleton;

/**
 * 
 * @author henry
 *	����ʽ����
 */
public class LazySingleton {
	
	private static LazySingleton singleton;
	
	private LazySingleton(){};
	
	/**
	 * ����synchronized�����߳̿��ܲ������ʵ����������ֻ�е�һ��ִ�д˷���ʱ���á�
	 * 1. ���getInstan()�����ܶ�Ӧ�ò��Ǻܹؼ�����ʲô��������
	 * 2. ���ö���ʽ������
	 * 3. ��˫�ؼ�������
	 * @return
	 */
	public static synchronized LazySingleton getInstance() {
		if(singleton==null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
