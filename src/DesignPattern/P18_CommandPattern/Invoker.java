package DesignPattern.P18_CommandPattern;

public class Invoker {
	private ICommand command;
	
	public Invoker(ICommand command) {
		this.command = command;
	}
	
	public void invoke() {
		this.command.execute();
	}
}