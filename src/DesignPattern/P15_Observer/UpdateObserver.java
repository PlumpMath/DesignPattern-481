package DesignPattern.P15_Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲���	ʵ�� java.util.Observer�ӿ�
 * @author stone
 *
 */
public class UpdateObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("���յ����ݱ仯��֪ͨ:");
		if (o instanceof UpdateObservable) {
			UpdateObservable uo = (UpdateObservable) o;
			System.out.print("���ݱ��Ϊ��" + uo.getData());
		}
	}

}