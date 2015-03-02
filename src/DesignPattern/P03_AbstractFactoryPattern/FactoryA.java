package DesignPattern.P03_AbstractFactoryPattern;

//ʵ�幤�� ����ʵ���Ʒ����������Ϊ�����Ʒ
public class FactoryA implements IFactory {

	public IProduct1 createProduct1() {
		return new GradeProduct1A();
	}


	public IProduct2 createProduct2() {
		return new GradeProduct2A();
	}

}