package DesignPattern.P04_BuilderPattern;

/**
 * ָ���ߣ�ָ�� ��� ����
 * ���Builder
 * @author stone
 *
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	/**
	 * ���췽���������˽��������
	 * �����Ҫ����������ʵ�֣���newһ��ָ����Director�Ϳ�
	 */
	public void construct() {
		System.out.println("director ָ�� builder���н���");
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
	
}
