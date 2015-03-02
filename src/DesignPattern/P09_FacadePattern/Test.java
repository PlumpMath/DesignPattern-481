package DesignPattern.P09_FacadePattern;

/**
 * ���(Facade)ģʽ
 * 		�򵥵�˵���ǽ�����������֮�����϶ȣ�ʹ��һ��Facade��������ԭ��������á���ʹ�õ�Ƶ����ʵ�ǳ��ĸ�
 * ����̬������ʵ������Щ���ƣ���ͬ���ǣ����ģʽ�п��Գ��ж��ʵ���������ã��������ʵ��ҵ����
 * @author stone
 *
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * �����ʹ�����ģʽ����ô��Actor��Scene��������һ����Ҫ���жԷ�������
		 * ����Ҫ����µľ��幦����ʱ��ֻ��Ҫ��Facade�����һ�����ã�����Ӧ�����ں�����ʹ�ü���
		 */
		Facade facade = new Facade();
		facade.startGame();
		System.out.println("----");
		facade.endGame();
	}
}
