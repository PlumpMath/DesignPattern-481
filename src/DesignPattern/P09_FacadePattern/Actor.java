package DesignPattern.P09_FacadePattern;

/**
 * ��ɫ
 * @author stone
 *
 */
public class Actor {
	public Actor(String name) {
		System.out.println("�����˽�ɫ: " + name);
	}
	
	public void load() {
		System.out.println("��ɫ����");
	}
	
	public void unload() {
		System.out.println("��ɫ�˳�,�浵");
	}
}