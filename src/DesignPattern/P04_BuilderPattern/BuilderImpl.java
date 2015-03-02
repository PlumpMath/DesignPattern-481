package DesignPattern.P04_BuilderPattern;

public class BuilderImpl implements Builder {
	
	@Override
	public void buildPartA() {
		System.out.println("建造部件A");
	}

	@Override
	public void buildPartB() {
		System.out.println("建造部件B");
	}

	@Override
	public void buildPartC() {
		System.out.println("建造部件C");
	}

}