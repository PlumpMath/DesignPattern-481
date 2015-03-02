package DesignPattern.P10_BridgePattern;

/*
 * �Ž�(Bridge)ģʽ, �ǽṹ��ģʽ
 * 
 * ��������ʵ�ֻ����ʹ�ö��߿��Զ����ı仯��Ҳ����˵������֮���ǿ���������������
 * Ҳ����ָ��һ�����ϵͳ�ĳ��󻯺�ʵ�ֻ�֮��ʹ�����/�ۺϹ�ϵ�����Ǽ̳й�ϵ���Ӷ�ʹ���߿��Զ����ı仯��
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * �ڱ����У��ֻ����ֻ���֮����ǿ�����Ĺ�ϵ��Ҫô�ֻ���Ӧһ�ֿ�(BaseCellphoneShell)��Ҫô�Ƕ�Ӧһ���ֻ�(BaseCellphone)
		 * �ֻ������ж�ά�ȱ仯��������Ʒ�ƻ��ֵġ����ݳߴ绮�ֵġ����ݸ������󻮷ֵĵ�
		 * �ֻ���Ҳ�ж�ά�ȱ仯����Ϊ��Ҫ�������滮�ֳ������ֻ�
		 * ����������BaseCellphone�У��ۺϽ�����BaseCellphoneShell
		 */
		BaseCellphone cellphone = new Cellphone();
		cellphone.setShell(new CellphoneShell());//�ۺϽ���
		cellphone.mapping();
		BaseCellphone cellphone2 = new Cellphone2();
		cellphone2.setShell(new CellphoneShell2());//�ۺϽ���
		cellphone2.mapping();
	}
}
