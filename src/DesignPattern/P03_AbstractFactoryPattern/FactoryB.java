package DesignPattern.P03_AbstractFactoryPattern;

//实体工厂 创建实体产品，返回类型为抽象产品
public class FactoryB implements IFactory {

	public IProduct1 createProduct1() {
		return new GradeProduct1B();
	}

	public IProduct2 createProduct2() {
		return new GradeProduct2B();
	}
}