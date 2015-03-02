package DesignPattern.P13_StrategyPattern;

/**
 * ��������  ��ȡ�ֽ�
 * @author stone
 *
 */
public class CashReturn implements ICashSuper {
	private double moneyCondition; //���ֵ��޽��
	private double returnMoney; //�������
	public CashReturn(double moneyCondition, double returnMoney) {
		this.moneyCondition = moneyCondition;
		this.returnMoney = returnMoney;
	}

	@Override
	public double acceptCash(double money) {//���ط���
		if (money >= moneyCondition) {
			return money - Math.floor(money / moneyCondition) * returnMoney;
		} else {
			return money;
		}
	}
	
	
}