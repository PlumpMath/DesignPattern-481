package DesignPattern.P02_SimpleFactoryPattern;

public class CalcAdd implements ICalculation {

	@Override
	public double getResult(double numA, double numB) {
		System.out.println("�ӷ�");
		return numA + numB;
	}

}
