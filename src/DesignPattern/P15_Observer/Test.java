package DesignPattern.P15_Observer;

/**
 * �۲���(Observer)ģʽ	��Ϊ��ģʽ
 *   �۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ�۲�ĳһ��Ŀ�����
 *   ���Ŀ�������״̬�Ϸ����仯ʱ����֪ͨ���й۲��߶����������ܹ��Զ������Լ�
 * Ŀ���������Ҫ����ӡ��Ƴ���֪ͨ �۲��ߵĽӿ�
 *   
 * @author stone
 */
public class Test {
	
	public static void main(String[] args) {
		/*
		 * ʹ��Java�Դ���Observer�ӿں�Observable��
		 */
		UpdateObservable observable = new UpdateObservable(new UpdateObserver());
		observable.setData(99);
		System.out.println("");
		System.out.println("");

		
		/*
		 * ��ģʽ-������
		 */
		
		User user = new User();
		user.register(new IRegisterListener() {
			
			@Override
			public void onRegistered() {
				System.out.println("������ע��󡣡���");
			}
		});
		user.login(new ILoginListener() {
			
			@Override
			public void onLogined() {
				System.out.println("��������¼�󡣡���");
			}
		});
		
	}
}
