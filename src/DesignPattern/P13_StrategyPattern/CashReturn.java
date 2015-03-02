package DesignPattern.P13_StrategyPattern;

/**
 * 让利返现  收取现金
 * @author stone
 *
 */
public class CashReturn implements ICashSuper {
	private double moneyCondition; //返现底限金额
	private double returnMoney; //返还金额
	public CashReturn(double moneyCondition, double returnMoney) {
		this.moneyCondition = moneyCondition;
		this.returnMoney = returnMoney;
	}

	@Override
	public double acceptCash(double money) {//多重返利
		if (money >= moneyCondition) {
			return money - Math.floor(money / moneyCondition) * returnMoney;
		} else {
			return money;
		}
	}
	
	
}