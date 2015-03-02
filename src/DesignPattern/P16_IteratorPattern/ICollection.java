package DesignPattern.P16_IteratorPattern;

/**
 * 自定义集合接口, 类似java.util.Collection
 * 用于数据存储
 * @author stone
 *
 */
public interface ICollection<T> {
	
	IIterator2<T> iterator(); //返回迭代器
	void add(T t);
	T get(int index);
}
