package DesignPattern.P16_IteratorPattern;

/**
 * �Զ��弯�Ͻӿ�, ����java.util.Collection
 * �������ݴ洢
 * @author stone
 *
 */
public interface ICollection<T> {
	
	IIterator2<T> iterator(); //���ص�����
	void add(T t);
	T get(int index);
}
