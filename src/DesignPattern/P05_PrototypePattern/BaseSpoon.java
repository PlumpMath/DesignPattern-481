package DesignPattern.P05_PrototypePattern;

public class BaseSpoon implements Cloneable {//spoon ³×, µ÷¸þ 
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected BaseSpoon clone() throws CloneNotSupportedException {
		System.out.println("clone a BaseSpoon");
		BaseSpoon object = null;
		try {
			object = (BaseSpoon) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.err.println("BaseSpoon is not Cloneable");
		}
		return object;
	}
}