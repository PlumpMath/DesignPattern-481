package DesignPattern.P02_SimpleFactoryPattern;

public class CalcSubtract implements ICalculation {

	@Override
	public double getResult(double numA, double numB) {
		System.out.println("¼õ·¨");
		return numA - numB;
	}

}