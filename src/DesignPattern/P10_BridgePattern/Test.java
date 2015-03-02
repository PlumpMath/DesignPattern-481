package DesignPattern.P10_BridgePattern;

/*
 * 桥接(Bridge)模式, 是结构型模式
 * 
 * 将抽象化与实现化脱耦，使得二者可以独立的变化，也就是说将他们之间的强关联变成弱关联，
 * 也就是指在一个软件系统的抽象化和实现化之间使用组合/聚合关系而不是继承关系，从而使两者可以独立的变化。
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * 在本例中：手机和手机壳之间有强关联的关系：要么手机对应一种壳(BaseCellphoneShell)，要么壳对应一种手机(BaseCellphone)
		 * 手机可以有多维度变化，如依据品牌划分的、依据尺寸划分的、依据个性需求划分的等
		 * 手机壳也有多维度变化，因为它要适配上面划分出来的手机
		 * 将桥作在了BaseCellphone中，聚合接入了BaseCellphoneShell
		 */
		BaseCellphone cellphone = new Cellphone();
		cellphone.setShell(new CellphoneShell());//聚合接入
		cellphone.mapping();
		BaseCellphone cellphone2 = new Cellphone2();
		cellphone2.setShell(new CellphoneShell2());//聚合接入
		cellphone2.mapping();
	}
}
