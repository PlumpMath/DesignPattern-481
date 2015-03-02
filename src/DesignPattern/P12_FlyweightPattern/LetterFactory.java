package DesignPattern.P12_FlyweightPattern;

import java.util.HashMap;
import java.util.Map;


/**
 * һ��������ĸ����� ��Ԫ����(��������)
 * @author stone
 *
 */
public class LetterFactory {
	private Map<String, Letter> map;
	private static LetterFactory instance = new LetterFactory();
	
	private LetterFactory() {
		map = new HashMap<String, Letter>();
	}
	
	public static LetterFactory getInstance() {
		return instance;
	}
	
	public void add(Letter letter) {
		if (letter != null && !map.containsKey(letter.getName())) {
			map.put(letter.getName(), letter);
		}
	}
	
	public Letter get(String name) {
		return map.get(name);
	}
	
}
