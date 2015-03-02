package DesignPattern.P02_SimpleFactoryPattern;

public class CalcMultipleFactory {
	
	public static ICalculation produceAdd() {
		return new CalcAdd();
	}
	
	public static ICalculation produceSubtract() {
		return new CalcSubtract();
	}
	
//	public static ICalculation produceMultiply() {
//		return new CalcMultiply();
//	}
//	
//	public static ICalculation produceDivide() {
//		return new CalcDivide();
//	}
}
