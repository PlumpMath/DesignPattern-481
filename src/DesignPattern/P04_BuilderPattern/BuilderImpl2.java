package DesignPattern.P04_BuilderPattern;

public class BuilderImpl2 implements Builder {
	
	@Override
	public void buildPartA() {
		System.out.println("���첿��AA");
	}

	@Override
	public void buildPartB() {
		System.out.println("���첿��BB");
	}

	@Override
	public void buildPartC() {
		System.out.println("���첿��CC");
	}

}
