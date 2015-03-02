package DesignPattern.P07_DecoratorPattern;

public class BufferedReader implements IReader {
	
	private IReader mReader;
	public BufferedReader(IReader reader) {
		this.mReader = reader;
	}
	
	@Override
	public void read() {
		System.out.println("read of BufferedReader");
		mReader.read();
	}

}
