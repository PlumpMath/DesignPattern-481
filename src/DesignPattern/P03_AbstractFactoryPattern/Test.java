package DesignPattern.P03_AbstractFactoryPattern;

/*
 * ���󹤳�ģʽ����������һ����ػ����໥�����Ķ���
 * 
 * ���̣����󹤳���ʵ�幤��		������Ʒ
 * 		�����Ʒ��ʵ���Ʒ		ʵ�ֲ�Ʒ����
 * ȱ�㣺����Ҫ����һ����Ʒ(�ɳ����ʵ�幹��)����������Ҫ����
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("A�๤�������Ĳ�Ʒ��");
		IFactory factory = new FactoryA();
		IProduct1 product1a = factory.createProduct1();
		product1a.show();
		IProduct2 product1b = factory.createProduct2();
		product1b.show();
		System.out.println("B�๤�������Ĳ�Ʒ��");
		IFactory factory2 = new FactoryB();		
		IProduct1 product2a = factory2.createProduct1();
		product2a.show();
		IProduct2 product2b = factory2.createProduct2();
		product2b.show();
	}
}
