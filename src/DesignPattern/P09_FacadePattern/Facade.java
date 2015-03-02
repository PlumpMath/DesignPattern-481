package DesignPattern.P09_FacadePattern;

/**
 * ����࣬��һ��ҵ�����࣬����ʵ����Ҫ������������� ҵ�����
 * @author stone
 *
 */
public class Facade {
	Actor actor;
	Scene scene;
	
	public Facade() {
		this.actor = new Actor("lisi");
		this.scene = new Scene("����ʢ��");
	}
	
	public void startGame() {
		actor.load();
		scene.load();
	}
	
	public void endGame() {
		actor.unload();
		scene.unload();
	}
}
