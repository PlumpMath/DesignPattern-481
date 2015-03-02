package DesignPattern.P09_FacadePattern;

/**
 * 外观类，即一个业务功能类，它的实现需要持有其他具体的 业务对象
 * @author stone
 *
 */
public class Facade {
	Actor actor;
	Scene scene;
	
	public Facade() {
		this.actor = new Actor("lisi");
		this.scene = new Scene("海天盛宴");
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
