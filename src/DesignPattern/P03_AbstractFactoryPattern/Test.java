package DesignPattern.P03_AbstractFactoryPattern;

/*
 * 抽象工厂模式：用来创建一组相关或者相互依赖的对象
 * 
 * 流程：抽象工厂，实体工厂		生产产品
 * 		抽象产品，实体产品		实现产品功能
 * 缺点：当需要增加一个产品(由抽象和实体构成)，工厂都需要更改
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("A类工厂生产的产品：");
		IFactory factory = new FactoryA();
		IProduct1 product1a = factory.createProduct1();
		product1a.show();
		IProduct2 product1b = factory.createProduct2();
		product1b.show();
		System.out.println("B类工厂生产的产品：");
		IFactory factory2 = new FactoryB();		
		IProduct1 product2a = factory2.createProduct1();
		product2a.show();
		IProduct2 product2b = factory2.createProduct2();
		product2b.show();
	}
}
