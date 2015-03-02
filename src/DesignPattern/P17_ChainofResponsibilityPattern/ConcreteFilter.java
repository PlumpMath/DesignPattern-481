package DesignPattern.P17_ChainofResponsibilityPattern;
/**
 * 具体责任
 * @author stone
 *
 */
public class ConcreteFilter extends IFilter {
	
	private String name;
	public ConcreteFilter(String name) {
		this.name = name;
	}
	
	@Override
	public void handleFilter() {
		/*
		 * 自己先处理，如有后继者，再由它处理一次
		 */
		System.out.println(name + " 处理了请求");
		if (getSuccessor() != null) {
			getSuccessor().handleFilter();
		}
	}
	
	@Override
	public void handleFilter2() {
		/*
		 * 有后继者就后继者处理, 否则自己处理
		 */
		if (getSuccessor() != null) {
			getSuccessor().handleFilter2();
		} else {
			System.out.println(name + " 处理了请求");
		}
	}
}

