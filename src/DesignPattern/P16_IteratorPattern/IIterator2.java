package DesignPattern.P16_IteratorPattern;
/**
 * 自定义迭代器接口 类似于java.util.Iterator
 * 用于遍历集合类ICollection的数据
 * @author stone
 *
 */
public interface IIterator2<T> {
	boolean hasNext();
	boolean hasPrevious();
	T next();
	T previous();
}
