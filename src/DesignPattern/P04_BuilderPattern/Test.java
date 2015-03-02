package DesignPattern.P04_BuilderPattern;

/* 
 * 建造者模式：建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，
 * 
 * 将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式
 */
public class Test {
	public static void main(String[] args) {
		Builder builder = new BuilderImpl();
		Director director = new Director(builder);
		/*
		 * 同样的构建过程，不同的模块(buildPartA、buildPartB、buildPartC)实现， new一个builder的实现
		 * 不同的构建过程，new 一个director
		 * 不同的构建过程，不同的模块实现， new director，new builder
		 */
		
		director.construct();
		
		System.out.println("");
		
		Builder builder2 = new BuilderImpl2();
		Director director2 = new Director(builder2);
		director2.construct();
		
		System.out.println("");
		
		Builder builder3 = new BuilderImpl2();
		Director2 director3 = new Director2(builder3);
		director3.construct();
	}
}