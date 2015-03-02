package DesignPattern.P10_BridgePattern;

/**
 * 手机的实现
 * @author stone
 *
 */
public class Cellphone extends BaseCellphone {

	@Override
	public void mapping() {
		System.out.println("本手机对应的壳是：");
		getShell().mapping();
	}

}