package DesignPattern.P13_StrategyPattern;

/**
 * 策略模式：针对同一命令(或行为),不同的策略做不同的动作
 *  商品促销
 *  本类为：收取现金的类
 *  
 *  @author stone
 */
public interface ICashSuper {
	 double acceptCash(double money);
}