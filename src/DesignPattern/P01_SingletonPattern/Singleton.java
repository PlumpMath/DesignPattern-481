package DesignPattern.P01_SingletonPattern;

public class Singleton {
	private static Singleton intance;
	private Singleton() {}
	
	public static Singleton getInstance() {
		/*
		 * 一开始多线程进来，遇到锁，一个线程进去，是为空，new对象； 后续线程进入，不为空，不操作；最后直接返回
		 * 对象不为空，再有多个线程进入该函数，不为空，不执行加锁操作，直接返回
		 * 由于指令重排序问题，所以不可以直接写成下面这样: 但是如果instance实例变量用volatile修饰就可以了
		 */
		if (intance == null) {
			synchronized (Singleton.class) {
				if (intance == null) {
					intance = new Singleton();
				}
			}
		}
		return intance;
	}
}

class Singleton1 {// 懒汉式 
	private static Singleton1 intance = new Singleton1();//懒的，程序运行的时候就加载出来了
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return intance;
	}
}

class Singleton2 {// 饿汉式
	private static Singleton2 intance;
	private Singleton2() {}
	
	public static Singleton2 getInstance() {//用到的时候 才加载
		if (intance == null) {
			intance = new Singleton2();
		}
		return intance;
	}
}

class Singleton3 {// 饿汉式 线程安全
	private static Singleton3 intance;
	private Singleton3() {}
	
	public synchronized static Singleton3 getInstance() {//用到的时候 才加载, 加锁  多线程调用，都有一个加锁的动作
		if (intance == null) {
			intance = new Singleton3();
		}
		return intance;
	}
}

class Singleton4 {// 饿汉式 线程安全
	private static Singleton4 intance;
	private Singleton4() {}
	
	public static Singleton4 getInstance() {//用到的时候 才加载
		synchronized (Singleton4.class) {// 加锁 效率跟3差不多
			if (intance == null) {
				intance = new Singleton4();
			}
		}
		return intance;
	}
}