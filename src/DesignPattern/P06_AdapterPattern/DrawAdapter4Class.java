package DesignPattern.P06_AdapterPattern;

	/**
	 * �������� ʹ�ö���̳еķ�ʽ���Ǿ�̬�Ķ��巽ʽ
	 * @author stone
	 *
	 */
	public class DrawAdapter4Class extends DrawRectangle implements IDrawCircle {//���ܻ������ܻ�Բ

		@Override
		public void drawCircle() {
			System.out.println("DrawAdapter: drawCircle");
		}
		
	}
