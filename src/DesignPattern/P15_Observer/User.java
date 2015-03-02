package DesignPattern.P15_Observer;

/*
 * ������ �ǹ۲���ģʽ��һ��ʵ��
 * һЩ��Ҫ������ҵ��ӿ������� �����������ü���������Ӧ������ʵ�ּ���
 */
public class User {
	
	public void register(IRegisterListener register) {
		/*
		 * do ... register
		 */
		System.out.println("����ע����...");
		//ע���
		register.onRegistered();
	}

	public void login(ILoginListener login) {
		/*
		 * do ... login
		 */
		System.out.println("���ڵ�¼��...");
		//��¼��
		login.onLogined();
	}

}