package DesignPattern.P14_TemplateMethodPattern;

/**
 * 业务流程模板，提供基本框架
 * @author stone
 *
 */
public abstract class BaseTemplate {
	
	public abstract void part1();

	public abstract void part2();

	public abstract void part3();

	//这里为了严格实验结果，使用final不可被重写
	public final void useTemplateMethod() {
		part1();
		part2();
		part3();
	}
}
