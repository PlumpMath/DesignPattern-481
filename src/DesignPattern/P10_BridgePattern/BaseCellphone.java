package DesignPattern.P10_BridgePattern;

/**
 * 手机,桥接了 手机壳BaseCellphoneShell
 * @author stone
 */
public abstract class BaseCellphone {
	
	private BaseCellphoneShell shell;

	public void setShell(BaseCellphoneShell shell) {
		this.shell = shell;
	}

	public BaseCellphoneShell getShell() {
		return shell;
	}

	public abstract void mapping();//对应哪种壳

}