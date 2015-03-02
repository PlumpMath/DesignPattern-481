package DesignPattern.P18_CommandPattern;

/*
 * ����(Command)ģʽ
 * ������ִ�� ����
 * ���Զ������ӿڵ�ʵ���࣬������ʵ�ı����÷�
 */
public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();//������ִ����
		ICommand command = new ConcreteCommand(receiver);//���ڵĸ��������
		Invoker invoker = new Invoker(command );//������
		invoker.invoke();
	}
}
