package DesignPattern.P04_BuilderPattern;

/**
 * ָ���ߣ�ָ�� ��� ����
 * ���Builder
 * @author stone
 *
 */
public class Director2 {
	private Builder builder;
	
	public Director2(Builder builder) {
		this.builder = builder;
	}
	/**
	 * ���췽���������˽��������
	 * �����Ҫ����������ʵ�֣���newһ��ָ����Director�Ϳ�
	 */
	public void construct() {
		System.out.println("director2 ָ�� builder���н���");
		builder.buildPartB();
		builder.buildPartC();
		builder.buildPartA();
	}
	
}
