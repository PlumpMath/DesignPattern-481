package DesignPattern.P14_TemplateMethodPattern;

/**
 * 模板实现方式2
 * @author stone
 *
 */
public class TemplateMethod2 extends BaseTemplate {

	@Override
	public void part1() {
		System.out.println("模板方法11");
	}

	@Override
	public void part2() {
		System.out.println("模板方法22");
	}

	@Override
	public void part3() {
		System.out.println("模板方法33");
	}
	
}
