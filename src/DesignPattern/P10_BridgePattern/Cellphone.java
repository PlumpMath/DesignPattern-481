package DesignPattern.P10_BridgePattern;

/**
 * �ֻ���ʵ��
 * @author stone
 *
 */
public class Cellphone extends BaseCellphone {

	@Override
	public void mapping() {
		System.out.println("���ֻ���Ӧ�Ŀ��ǣ�");
		getShell().mapping();
	}

}