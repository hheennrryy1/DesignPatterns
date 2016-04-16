#Singleton
##LazySingleton
1. 不加synchronized，多线程可能产生多个实例，但加了只有第一次执行此方法时有用。
2. 如果getInstan()的性能对应用不是很关键，就什么都别做。
3. 改用饿汉式单例。
4. 用双重检查加锁(double-checked locking)

##double-checked locking
Volatile修饰的成员变量在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。而且，当成员变量发生变化时，
强迫线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
