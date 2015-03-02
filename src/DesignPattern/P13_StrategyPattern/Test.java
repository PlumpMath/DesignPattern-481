package DesignPattern.P13_StrategyPattern;

/*
 * ����(Strategy)ģʽ ��ע����Ϊ��ѡ��
 * ��װ��һϵ�в��Զ����û���ѡ��ʹ�����ֲ��Զ���
 * ��򵥹���������
 * 		����ģʽ��������Զ����Context����Context��װ���Զ���ķ������ã����⹫��Context�ķ����ӿ�
 * 		�򵥹���ģʽ������һ���򵥲�������������Ȼ����ó�������ķ���
 * ��װ��ģʽ������
 * 		�����ԣ�Context����ʵ��(implements)ҵ��ӿ�,����Ҫ��ǿ���еĲ��Զ���Ĺ���
 * ����ģʽ�������㷨����ϵͳ��, ���繤�ʽ���
 */
public class Test {
	public static void main(String[] args) {
		double money = 998; //ԭ��
		CashContext cashContext = new CashContext(new CashNormal());
		System.out.println("ԭ�ۣ�" + cashContext.acceptCash(money)); //ͨ��  ����
		
		cashContext.setCasher(new CashRebate(8.5));
		System.out.println("��85�ۣ�" + cashContext.acceptCash(money)); //�ۿ�   ����   85��
		
		cashContext.setCasher(new CashReturn(300, 50));
		System.out.println("��300 ��50��" + cashContext.acceptCash(money)); //����  ����    ��300 ��50
		
	}
}
