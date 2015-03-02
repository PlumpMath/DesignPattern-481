package DesignPattern.P16_IteratorPattern;
import java.util.Arrays;


/**
 * 集合类， 依赖于MyIterator
 * @author stone
 */
public class MyCollection<T> implements ICollection<T> {

	private T[] arys;
	private int index = -1;
	private int capacity = 5;
	public MyCollection() {
		this.arys = (T[]) new Object[capacity];
	}
	
	@Override
	public IIterator2<T> iterator() {
		return new MyIterator<T>();
	}
	
	@Override
	public void add(T t) {
		index++;
		if (index == capacity) {
			capacity *= 2;
			this.arys = Arrays.copyOf(arys, capacity);
			
		}
		this.arys[index] = t;
	}
	
	@Override
	public T get(int index) {
		return this.arys[index];
	}

    private class MyIterator<T> implements IIterator2{
    	ICollection<T> col = null;
    	int cur = 0;
    	int size = 0;
    	@Override
    	public boolean hasNext() {
    		// TODO Auto-generated method stub
    		return cur!=index;
    	}

    	@Override
    	public boolean hasPrevious() {
    		// TODO Auto-generated method stub
    		return false;
    	}

    	@Override
    	public Object next() {
    		cur++;
    		return arys[cur];
    	}

    	@Override
    	public Object previous() {
    		// TODO Auto-generated method stub
    		return null;
    	}

    }
}



