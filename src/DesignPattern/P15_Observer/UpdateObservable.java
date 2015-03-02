package DesignPattern.P15_Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲�Ŀ�� �̳��� java.util.Observable
 * @author stone
 *
 */
public class UpdateObservable extends Observable {
	
	private int data;
	
	public UpdateObservable(Observer observer) {
		addObserver(observer);
		/*
		 * add other observer
		 */
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		if (data != this.data) {
			this.data = data;
			setChanged(); //��� �ı�, ֻ�б�Ǻ����֪ͨ��
			notifyObservers(); //֪ͨ
		}
		
	}

	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		super.deleteObserver(o);
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	@Override
	public void notifyObservers(Object arg) {
		super.notifyObservers(arg);
	}

	@Override
	public synchronized void deleteObservers() {
		super.deleteObservers();
	}

	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}

	@Override
	protected synchronized void clearChanged() {
		super.clearChanged();
	}

	@Override
	public synchronized boolean hasChanged() {
		return super.hasChanged();
	}

	@Override
	public synchronized int countObservers() {
		return super.countObservers();
	}
	
}
