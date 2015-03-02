package DesignPattern.P13_StrategyPattern;

/**
 * 正常收取现金
 * @author stone
 *
 */
public class CashNormal implements ICashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
