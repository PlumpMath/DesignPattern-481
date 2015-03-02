package DesignPattern.P05_PrototypePattern;

/*
 * 原型模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * Prototype原型模式是一种创建型设计模式，Prototype模式允许一个对象再创建另外一个可定制的对象，根本无需知道任何如何创建的细节,
 * 工作原理是:通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建。
 * 在java中 体现为 clone() 对象
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		//创建原型
		BaseSpoon soup1 = new SoupSpoon();
		BaseSpoon salad1 = new SaladSpoon();
		//clone原型 得到新对象
		SoupSpoon soup2 = (SoupSpoon) soup1.clone();
		SaladSpoon salad2 = (SaladSpoon) salad1.clone();
		//输出clone后原型和对应新对象的名字
		System.out.println("clone 后：" + soup1.getName() + "-" + soup2.getName());
		System.out.println("clone 后：" + salad1.getName() + "-" + salad2.getName());
		
		soup1.setName("soup1 spoon");
		salad1.setName("salad1 spoon");
		soup2.setName("soup2 spoon");
		salad2.setName("salad2 spoon");
		
		System.out.println("属性重新赋值后：" + soup1.getName() + "-" + soup2.getName());
		System.out.println("属性重新赋值后：" + salad1.getName() + "-" + salad2.getName());
	}
}