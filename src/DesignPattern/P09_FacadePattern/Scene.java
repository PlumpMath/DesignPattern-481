package DesignPattern.P09_FacadePattern;

/**
 * 场景
 * @author stone
 *
 */
public class Scene {
	public Scene(String name) {
		System.out.println("创建了场景: " + name);
	}
	
	public void load() {
		System.out.println("场景加载");
	}
	
	public void unload() {
		System.out.println("场景卸载");
	}
}
