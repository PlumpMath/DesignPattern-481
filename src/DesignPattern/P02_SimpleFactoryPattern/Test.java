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
	 * �򵥹���ģʽ ��ע������Ĵ���
	 * ����һ�������࣬��ʵ����ͬһ�ӿڵĻ����Ǵ��ڼ̳й�ϵ��һЩ�����ʵ���Ĵ���
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
