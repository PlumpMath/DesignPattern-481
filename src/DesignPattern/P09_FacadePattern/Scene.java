package DesignPattern.P09_FacadePattern;

/**
 * ����
 * @author stone
 *
 */
public class Scene {
	public Scene(String name) {
		System.out.println("�����˳���: " + name);
	}
	
	public void load() {
		System.out.println("��������");
	}
	
	public void unload() {
		System.out.println("����ж��");
	}
}
