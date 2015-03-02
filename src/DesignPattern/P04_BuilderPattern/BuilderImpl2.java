package DesignPattern.P04_BuilderPattern;

public class BuilderImpl2 implements Builder {
	
	@Override
	public void buildPartA() {
		System.out.println("建造部件AA");
	}

	@Override
	public void buildPartB() {
		System.out.println("建造部件BB");
	}

	@Override
	public void buildPartC() {
		System.out.println("建造部件CC");
	}

}
