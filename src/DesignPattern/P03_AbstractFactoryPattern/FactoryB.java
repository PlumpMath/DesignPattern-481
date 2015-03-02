package DesignPattern.P03_AbstractFactoryPattern;

//ʵ�幤�� ����ʵ���Ʒ����������Ϊ�����Ʒ
public class FactoryB implements IFactory {

	public IProduct1 createProduct1() {
		return new GradeProduct1B();
	}

	public IProduct2 createProduct2() {
		return new GradeProduct2B();
	}
}