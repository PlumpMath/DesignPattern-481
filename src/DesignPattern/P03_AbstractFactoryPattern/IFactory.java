package DesignPattern.P03_AbstractFactoryPattern;

//抽象工厂 创建不同的抽象产品
public interface IFactory {
	public IProduct1 createProduct1();//1类产品 型号A
	public IProduct2 createProduct2();//2类产品 型号A
}