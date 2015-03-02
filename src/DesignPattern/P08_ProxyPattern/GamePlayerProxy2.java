package DesignPattern.P08_ProxyPattern;

import java.util.Date;

/*
 * �ͻ��� �Ա�������󲻿ɼ�
 */
public class GamePlayerProxy2 implements IGamePlayer {

	private IGamePlayer gamePlayer = null;//���������

	// ͨ�����캯������Ҫ��˭���д���
	public GamePlayerProxy2(String username) {
		this.gamePlayer = new GamePlayer(username);
	}

	// ����ɱ��
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	// ������¼
	public void login(String user, String password) {
		System.out.println("��¼ʱ���ǣ�" + new Date().toLocaleString());
		this.gamePlayer.login(user, password);
	}

	// ��������
	public void upgrade() {
		this.gamePlayer.upgrade();
		System.out.println("����ʱ���ǣ�" + new Date().toLocaleString());
	}

}
