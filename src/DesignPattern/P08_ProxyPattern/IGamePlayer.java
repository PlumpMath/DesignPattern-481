package DesignPattern.P08_ProxyPattern;

/**
 * ��Ϸ�߽ӿ�
 * @author stone
 * 
 */
public interface IGamePlayer {

	// ��¼��Ϸ
	public void login(String user, String password);

	// ɱ�֣�������Ϸ����Ҫ��ɫ
	public void killBoss();

	// ����
	public void upgrade();

}
