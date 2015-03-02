package DesignPattern.P12_FlyweightPattern;

/*
 * 享元(Flyweight)模式	结构型模式		主要目的是实现对象的共享
 * 		字面上看就是 一个 共享元件的模式，这里是将 一些在系统中需要重复使用的对象，共享成单个元件
 * 
 *  像JDBC数据库连接池、线程池等 都是应用了享元模式
 *  	数据库连接池: 创建了一定数量的连接，存入池中，用到时取出，释放时再存入
 *  	池程池：类似，也是 用到时取出，释放时再存入
 *  所以一般 都会有一个集合来存储元件；有一个享元工厂进行元件的管理。
 */
public class Test {
	public static void main(String[] args) {
		LetterFactory factory = LetterFactory.getInstance();
		String word = "easiness";
		addLetterByName(factory, word);
		
		getLetter(factory, word);
	}
	//添加字母对象
	static void addLetterByName(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			factory.add(new Letter(c + ""));
		}
	}
	//输出字母对象
	static void getLetter(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			System.out.println(factory.get(c + ""));
		}
	}
}
