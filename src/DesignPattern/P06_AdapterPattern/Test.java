package DesignPattern.P06_AdapterPattern;

public class Test {
	public static void main(String[] args) {
		//对象适配器
		DrawAdapter4Obj objAdapter = new DrawAdapter4Obj(new DrawRectangle());
		objAdapter.drawCircle();
		objAdapter.drawRectangle(" in DrawAdapter4Object");
		
		System.out.println("--------------");
		
		//类适配器
		DrawAdapter4Class clzAdapter = new DrawAdapter4Class();
		clzAdapter.drawCircle();
		clzAdapter.drawRectangle("in DrawAdapter4Class");
		
		System.out.println("--------------");
		
		//接口适配器
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