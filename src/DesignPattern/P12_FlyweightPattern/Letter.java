package DesignPattern.P12_FlyweightPattern;

/**
 * ×ÖÄ¸
 * @author stone
 *
 */
public class Letter {

	private String name;

	public Letter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString(){
		return name;
	}
}