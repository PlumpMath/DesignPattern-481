package DesignPattern.P13_StrategyPattern;

/*
 * 策略(Strategy)模式 关注：行为的选择
 * 封装了一系列策略对象，用户来选择使用哪种策略对象
 * 与简单工厂的区别：
 * 		策略模式，传入策略对象给Context，由Context封装策略对象的方法调用，对外公开Context的方法接口
 * 		简单工厂模式，传入一个简单参数，创建对象，然后调用出厂对象的方法
 * 与装饰模式的区别：
 * 		很明显，Context无需实现(implements)业务接口,不需要增强已有的策略对象的功能
 * 策略模式多用在算法决策系统中, 比如工资结算
 */
public class Test {
	public static void main(String[] args) {
		double money = 998; //原价
		CashContext cashContext = new CashContext(new CashNormal());
		System.out.println("原价：" + cashContext.acceptCash(money)); //通常  策略
		
		cashContext.setCasher(new CashRebate(8.5));
		System.out.println("打85折：" + cashContext.acceptCash(money)); //折扣   策略   85折
		
		cashContext.setCasher(new CashReturn(300, 50));
		System.out.println("满300 返50：" + cashContext.acceptCash(money)); //返现  策略    满300 返50
		
	}
}
