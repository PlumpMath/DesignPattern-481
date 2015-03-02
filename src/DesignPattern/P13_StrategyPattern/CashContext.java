package DesignPattern.P13_StrategyPattern;

/**
 * 根据传递的的策略类，执行相应的行为
 * @author stone
 *
 */
public class CashContext {
	private ICashSuper casher;
	
	public CashContext() {
		
	}
	
	public CashContext(ICashSuper casher) {
		this.casher = casher;
	}
	
	public void setCasher(ICashSuper casher) {
		this.casher = casher;
	}
	
	//根据具体的策略对象，调用它的算法行为
	public double acceptCash(double money) {
		return this.casher.acceptCash(money);
	}
	
}