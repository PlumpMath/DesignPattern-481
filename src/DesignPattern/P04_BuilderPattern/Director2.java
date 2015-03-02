package DesignPattern.P04_BuilderPattern;

/**
 * 指挥者：指导 如何 建造
 * 组合Builder
 * @author stone
 *
 */
public class Director2 {
	private Builder builder;
	
	public Director2(Builder builder) {
		this.builder = builder;
	}
	/**
	 * 建造方法：定义了建造的流程
	 * 如果需要其他流程来实现，再new一个指挥者Director就可
	 */
	public void construct() {
		System.out.println("director2 指挥 builder进行建造");
		builder.buildPartB();
		builder.buildPartC();
		builder.buildPartA();
	}
	
}
