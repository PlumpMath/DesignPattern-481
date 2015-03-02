package DesignPattern.P05_PrototypePattern;

/*
 * ԭ��ģʽ
 * ��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���
 * Prototypeԭ��ģʽ��һ�ִ��������ģʽ��Prototypeģʽ����һ�������ٴ�������һ���ɶ��ƵĶ��󣬸�������֪���κ���δ�����ϸ��,
 * ����ԭ����:ͨ����һ��ԭ�Ͷ��󴫸��Ǹ�Ҫ���������Ķ������Ҫ���������Ķ���ͨ������ԭ�Ͷ��󿽱������Լ���ʵʩ������
 * ��java�� ����Ϊ clone() ����
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		//����ԭ��
		BaseSpoon soup1 = new SoupSpoon();
		BaseSpoon salad1 = new SaladSpoon();
		//cloneԭ�� �õ��¶���
		SoupSpoon soup2 = (SoupSpoon) soup1.clone();
		SaladSpoon salad2 = (SaladSpoon) salad1.clone();
		//���clone��ԭ�ͺͶ�Ӧ�¶��������
		System.out.println("clone ��" + soup1.getName() + "-" + soup2.getName());
		System.out.println("clone ��" + salad1.getName() + "-" + salad2.getName());
		
		soup1.setName("soup1 spoon");
		salad1.setName("salad1 spoon");
		soup2.setName("soup2 spoon");
		salad2.setName("salad2 spoon");
		
		System.out.println("�������¸�ֵ��" + soup1.getName() + "-" + soup2.getName());
		System.out.println("�������¸�ֵ��" + salad1.getName() + "-" + salad2.getName());
	}
}