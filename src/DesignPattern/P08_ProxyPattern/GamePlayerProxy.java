package DesignPattern.P08_ProxyPattern;

/**
 * �ͻ��� �Ա�������󲻿ɼ�
 */
public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;//���������

	// ͨ�����캯������Ҫ��˭���д���
	public GamePlayerProxy(String username) {
		this.gamePlayer = new GamePlayer(username);
	}

	// ����ɱ��
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	// ������¼
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	// ��������
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
