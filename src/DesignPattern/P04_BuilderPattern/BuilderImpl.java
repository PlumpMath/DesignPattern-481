package DesignPattern.P04_BuilderPattern;

public class BuilderImpl implements Builder {
	
	@Override
	public void buildPartA() {
		System.out.println("���첿��A");
	}

	@Override
	public void buildPartB() {
		System.out.println("���첿��B");
	}

	@Override
	public void buildPartC() {
		System.out.println("���첿��C");
	}

}