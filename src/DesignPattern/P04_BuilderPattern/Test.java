package DesignPattern.P04_BuilderPattern;

/* 
 * ������ģʽ��������ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶���
 * 
 * ��һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ�����������ģʽ����Ϊ������ģʽ
 */
public class Test {
	public static void main(String[] args) {
		Builder builder = new BuilderImpl();
		Director director = new Director(builder);
		/*
		 * ͬ���Ĺ������̣���ͬ��ģ��(buildPartA��buildPartB��buildPartC)ʵ�֣� newһ��builder��ʵ��
		 * ��ͬ�Ĺ������̣�new һ��director
		 * ��ͬ�Ĺ������̣���ͬ��ģ��ʵ�֣� new director��new builder
		 */
		
		director.construct();
		
		System.out.println("");
		
		Builder builder2 = new BuilderImpl2();
		Director director2 = new Director(builder2);
		director2.construct();
		
		System.out.println("");
		
		Builder builder3 = new BuilderImpl2();
		Director2 director3 = new Director2(builder3);
		director3.construct();
	}
}