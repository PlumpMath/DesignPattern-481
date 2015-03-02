package DesignPattern.P16_IteratorPattern;
/**
 * �Զ���������ӿ� ������java.util.Iterator
 * ���ڱ���������ICollection������
 * @author stone
 *
 */
public interface IIterator2<T> {
	boolean hasNext();
	boolean hasPrevious();
	T next();
	T previous();
}
