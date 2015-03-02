package DesignPattern.P02_SimpleFactoryPattern;

public class Test {

	public static void main(String[] args) {
		double numA = 182, numB = 33;
		
		ICalculation createCalc = CalcMultipleFactory.produceAdd();
		double result = createCalc.getResult(numA, numB);
		System.out.println(result);
		
		createCalc = CalcMultipleFactory.produceSubtract();
		result = createCalc.getResult(numA, numB);
		System.out.println(result);
		
//		createCalc = CalcMultipleFactory.produceMultiply();
//		result = createCalc.getResult(numA, numB);
//		System.out.println(result);
//		
//		createCalc = CalcMultipleFactory.produceDivide();
//		result = createCalc.getResult(numA, numB);
//		System.out.println(result);
	}
	
	/*
	 * 简单工厂模式 关注：对象的创建
	 * 建立一个工厂类，对实现了同一接口的或者是存在继承关系的一些类进行实例的创建
	 */

//		public static void main(String[] args) {
////			String operation = "/";
//			String operation = "+";
////			String operation = "-";
////			String operation = "*";
//			double numA = 182, numB = 33;
//			ICalculation createCalc = CalcSimpleFactory.createCalc(operation);
//			double result = createCalc.getResult(numA, numB);
//			System.out.println(result);
//		}
}
