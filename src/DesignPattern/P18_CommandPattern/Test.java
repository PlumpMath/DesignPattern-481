package DesignPattern.P18_CommandPattern;

/*
 * 命令(Command)模式
 * 请求与执行 分离
 * 可以多个命令接口的实现类，隐藏真实的被调用方
 */
public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();//真正的执行者
		ICommand command = new ConcreteCommand(receiver);//用于的隔离的命令
		Invoker invoker = new Invoker(command );//调用者
		invoker.invoke();
	}
}
