package DesignPattern.P14_TemplateMethodPattern;

/**
 * ҵ������ģ�壬�ṩ�������
 * @author stone
 *
 */
public abstract class BaseTemplate {
	
	public abstract void part1();

	public abstract void part2();

	public abstract void part3();

	//����Ϊ���ϸ�ʵ������ʹ��final���ɱ���д
	public final void useTemplateMethod() {
		part1();
		part2();
		part3();
	}
}
