package DesignPattern.P01_SingletonPattern;

public class Singleton {
	private static Singleton intance;
	private Singleton() {}
	
	public static Singleton getInstance() {
		/*
		 * һ��ʼ���߳̽�������������һ���߳̽�ȥ����Ϊ�գ�new���� �����߳̽��룬��Ϊ�գ������������ֱ�ӷ���
		 * ����Ϊ�գ����ж���߳̽���ú�������Ϊ�գ���ִ�м���������ֱ�ӷ���
		 * ����ָ�����������⣬���Բ�����ֱ��д����������: �������instanceʵ��������volatile���ξͿ�����
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

class Singleton1 {// ����ʽ 
	private static Singleton1 intance = new Singleton1();//���ģ��������е�ʱ��ͼ��س�����
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return intance;
	}
}

class Singleton2 {// ����ʽ
	private static Singleton2 intance;
	private Singleton2() {}
	
	public static Singleton2 getInstance() {//�õ���ʱ�� �ż���
		if (intance == null) {
			intance = new Singleton2();
		}
		return intance;
	}
}

class Singleton3 {// ����ʽ �̰߳�ȫ
	private static Singleton3 intance;
	private Singleton3() {}
	
	public synchronized static Singleton3 getInstance() {//�õ���ʱ�� �ż���, ����  ���̵߳��ã�����һ�������Ķ���
		if (intance == null) {
			intance = new Singleton3();
		}
		return intance;
	}
}

class Singleton4 {// ����ʽ �̰߳�ȫ
	private static Singleton4 intance;
	private Singleton4() {}
	
	public static Singleton4 getInstance() {//�õ���ʱ�� �ż���
		synchronized (Singleton4.class) {// ���� Ч�ʸ�3���
			if (intance == null) {
				intance = new Singleton4();
			}
		}
		return intance;
	}
}