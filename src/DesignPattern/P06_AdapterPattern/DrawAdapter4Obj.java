package DesignPattern.P06_AdapterPattern;

/**
 * ������������ ʹ�ö�����ϵķ�ʽ���Ƕ�̬��ϵķ�ʽ��
 * ���ܻ������ܻ�Բ
 * @author stone
 * DrawAdapter����������DrawRectangle����adapter,�Ǳ������ߣ����������������ߺ�����Ŀ�꣨DrawCircle����������
 *
 */
public class DrawAdapter4Obj implements IDrawCircle {//���ܻ������ܻ�Բ
	
	private DrawRectangle drawRectangle;
	public DrawAdapter4Obj(DrawRectangle drawRectangle) {
		this.drawRectangle = drawRectangle;
	}
	
	@Override
	public void drawCircle() {
		System.out.println("DrawAdapter4Object: drawcircle");
	}
	
	public void drawRectangle(String msg) {
		drawRectangle.drawRectangle(msg);
	} 
	
}