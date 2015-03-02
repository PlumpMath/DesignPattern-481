package DesignPattern.P10_BridgePattern;

/**
 * �ֻ�,�Ž��� �ֻ���BaseCellphoneShell
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

	public abstract void mapping();//��Ӧ���ֿ�

}