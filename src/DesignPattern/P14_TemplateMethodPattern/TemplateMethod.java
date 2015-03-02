package DesignPattern.P14_TemplateMethodPattern;

/**
 * 模板实现方式1
 * @author stone
 *
 */
public class TemplateMethod extends BaseTemplate {

	@Override
	public void part1() {
		System.out.println("模板方法1");
	}

	@Override
	public void part2() {
		System.out.println("模板方法2");
	}

	@Override
	public void part3() {
		System.out.println("模板方法3");
	}

}

