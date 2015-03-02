package DesignPattern.P13_StrategyPattern;

import java.math.BigDecimal;

/**
 * 打折收取现金 
 * @author stone
 *
 */
public class CashRebate implements ICashSuper {
	private double rebate; //折扣
	public CashRebate (double rebate) {
		this.rebate = rebate;
	}

	@Override
	public double acceptCash(double money) {
		return new BigDecimal(money * rebate / 10).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	
}