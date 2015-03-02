package DesignPattern.P15_Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者	实现 java.util.Observer接口
 * @author stone
 *
 */
public class UpdateObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("接收到数据变化的通知:");
		if (o instanceof UpdateObservable) {
			UpdateObservable uo = (UpdateObservable) o;
			System.out.print("数据变更为：" + uo.getData());
		}
	}

}