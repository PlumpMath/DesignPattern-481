package DesignPattern.P09_FacadePattern;

/**
 * 角色
 * @author stone
 *
 */
public class Actor {
	public Actor(String name) {
		System.out.println("创建了角色: " + name);
	}
	
	public void load() {
		System.out.println("角色加载");
	}
	
	public void unload() {
		System.out.println("角色退出,存档");
	}
}