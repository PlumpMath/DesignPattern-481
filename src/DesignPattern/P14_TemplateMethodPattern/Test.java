package DesignPattern.P14_TemplateMethodPattern;

/**
 * 模板方法(TemplateMethod)模式：行为型模式,定义了一系列操作的骨架，将模块的实现 延迟到实现类或者子类中实现。
 * 跟建造者模式的区别：
 * 		建造者模式，使用组合方式，由指挥者Director指挥组合的Builder建造，建造流程由Director控制，建造的模块方法由Builder实现
 * 		模板方法模式，由模板定义操作流程，由子类或实现类 实现具体的模块方法
 * 		综上，建造者模式灵活于模板方法模式
 * @author stone
 *
 */
public class Test {
	public static void main(String[] args) {
		BaseTemplate tm = new TemplateMethod();
		tm.useTemplateMethod();
		
		System.out.println("");
		
		BaseTemplate tm2 = new TemplateMethod2();
		tm2.useTemplateMethod();
	}
}
