package DesignPattern.P14_TemplateMethodPattern;

/**
 * ģ�巽��(TemplateMethod)ģʽ����Ϊ��ģʽ,������һϵ�в����ĹǼܣ���ģ���ʵ�� �ӳٵ�ʵ�������������ʵ�֡�
 * ��������ģʽ������
 * 		������ģʽ��ʹ����Ϸ�ʽ����ָ����Directorָ����ϵ�Builder���죬����������Director���ƣ������ģ�鷽����Builderʵ��
 * 		ģ�巽��ģʽ����ģ�嶨��������̣��������ʵ���� ʵ�־����ģ�鷽��
 * 		���ϣ�������ģʽ�����ģ�巽��ģʽ
 * @author stone
 *
 */
public class Test {
	public static void main(String[] args) {
		BaseTemplate tm = new TemplateMethod();
		tm.useTemplateMethod();
		
		System.out.println("");
		
		BaseTemplate tm2 = new TemplateMethod2();
		tm2.useTemplateMethod();
	}
}
