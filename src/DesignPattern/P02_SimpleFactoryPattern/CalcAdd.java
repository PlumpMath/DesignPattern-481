package DesignPattern.P02_SimpleFactoryPattern;

public class CalcAdd implements ICalculation {

	@Override
	public double getResult(double numA, double numB) {
		System.out.println("¼Ó·¨");
		return numA + numB;
	}

}
