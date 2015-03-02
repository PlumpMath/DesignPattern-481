package DesignPattern.P15_Observer;

/**
 * 观察者(Observer)模式	行为型模式
 *   观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时观察某一个目标对象。
 *   这个目标对象在状态上发生变化时，会通知所有观察者对象，让它们能够自动更新自己
 * 目标对象中需要有添加、移除、通知 观察者的接口
 *   
 * @author stone
 */
public class Test {
	
	public static void main(String[] args) {
		/*
		 * 使用Java自带的Observer接口和Observable类
		 */
		UpdateObservable observable = new UpdateObservable(new UpdateObserver());
		observable.setData(99);
		System.out.println("");
		System.out.println("");

		
		/*
		 * 子模式-监听器
		 */
		
		User user = new User();
		user.register(new IRegisterListener() {
			
			@Override
			public void onRegistered() {
				System.out.println("监听到注册后。。。");
			}
		});
		user.login(new ILoginListener() {
			
			@Override
			public void onLogined() {
				System.out.println("监听到登录后。。。");
			}
		});
		
	}
}
