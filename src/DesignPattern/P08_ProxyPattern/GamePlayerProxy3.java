package DesignPattern.P08_ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/*
 * �ͻ��� �Ա�������󲻿ɼ�
 */
public class GamePlayerProxy3 {

	private IGamePlayer gamePlayer;
	// ͨ�����캯������ ������(����)����
	public GamePlayerProxy3(IGamePlayer gamePlayer) {
		 this.gamePlayer = gamePlayer;
		 System.out.println("����һ������,����Ľ�ɫ�Ǳ��˵ģ����Զ�̬���ݽ���");
	}
	
	public IGamePlayer getProxy() {
		return (IGamePlayer) Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				new Class[]{IGamePlayer.class}, new MyInvocationHandler());
	}

	private class MyInvocationHandler implements InvocationHandler {
	
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if (method.getName().equals("login")) {
				System.out.println("��¼ʱ���ǣ�" + new Date().toLocaleString());
			} if (method.getName().equals("upgrade")) {
				System.out.println("����ʱ���ǣ�" + new Date().toLocaleString());
			}
			method.invoke(gamePlayer, args);
			return null;
		}
		
	}
}