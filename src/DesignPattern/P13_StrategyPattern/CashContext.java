package DesignPattern.P13_StrategyPattern;

/**
 * ���ݴ��ݵĵĲ����ִ࣬����Ӧ����Ϊ
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
	
	//���ݾ���Ĳ��Զ��󣬵��������㷨��Ϊ
	public double acceptCash(double money) {
		return this.casher.acceptCash(money);
	}
	
}