package DesignPattern.P13_StrategyPattern;

/**
 * ������ȡ�ֽ�
 * @author stone
 *
 */
public class CashNormal implements ICashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
