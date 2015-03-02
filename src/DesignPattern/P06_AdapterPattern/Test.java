package DesignPattern.P06_AdapterPattern;

public class Test {
	public static void main(String[] args) {
		//����������
		DrawAdapter4Obj objAdapter = new DrawAdapter4Obj(new DrawRectangle());
		objAdapter.drawCircle();
		objAdapter.drawRectangle(" in DrawAdapter4Object");
		
		System.out.println("--------------");
		
		//��������
		DrawAdapter4Class clzAdapter = new DrawAdapter4Class();
		clzAdapter.drawCircle();
		clzAdapter.drawRectangle("in DrawAdapter4Class");
		
		System.out.println("--------------");
		
		//�ӿ�������
		MyDrawAdapter myDrawAdapter = new MyDrawAdapter();
		myDrawAdapter.drawCircle();
		myDrawAdapter.drawRectangle();
	}
	
	static class MyDrawAdapter extends DefaultDrawAdapter {

		@Override
		public void drawCircle() {
			System.out.println("drawCircle in MyDrawAdapter");
		}
		
	}
}