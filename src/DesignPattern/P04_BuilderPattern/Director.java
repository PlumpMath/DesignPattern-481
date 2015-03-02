package DesignPattern.P04_BuilderPattern;

/**
 * 指挥者：指导 如何 建造
 * 组合Builder
 * @author stone
 *
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	/**
	 * 建造方法：定义了建造的流程
	 * 如果需要其他流程来实现，再new一个指挥者Director就可
	 */
	public void construct() {
		System.out.println("director 指挥 builder进行建造");
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
	
}
