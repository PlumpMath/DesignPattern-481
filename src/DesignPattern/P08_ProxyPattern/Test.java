package DesignPattern.P08_ProxyPattern;

import java.util.Date;

/*
 * ����ģʽ��Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 * 		��ĳЩ����£�һ�������ʺϻ��߲���ֱ��������һ�����󣬶������������ڿͻ��˺�Ŀ�����֮�����н������
 * �ŵ�
 (1).ְ������
 ��ʵ�Ľ�ɫ����ʵ��ʵ�ʵ�ҵ���߼������ù��������Ǳ�ְ�������ͨ�����ڵĴ������һ��������񣬸����Ľ�����Ǳ�̼��������
 (2).�����������ڿͻ��˺�Ŀ�����֮�����н�����ã��������˵����úͱ�����Ŀ���������á�
 (3).����չ��
 ģʽ�ṹ
 һ������������Ҫ���ʵĶ���(Ŀ����)��һ���Ǵ������,�������������
 ����ʵ��ͬһ���ӿ�,�ȷ��ʴ������ٷ�������Ҫ���ʵĶ���
 
 ��װ����ģʽ�ʹ���ģʽ֮�仹���кܶ���ġ�װ����ģʽ��ע����һ�������϶�̬����ӷ�����Ȼ������ģʽ��ע�ڿ��ƶԶ���ķ��ʡ�
 ���仰 ˵���ô���ģʽ�������ࣨproxy class�����Զ����Ŀͻ�����һ������ľ�����Ϣ����ˣ���ʹ�ô���ģʽ��ʱ�����ǳ�����һ���������д���һ�������ʵ����
 ���ң�������ʹ��װ����ģ ʽ��ʱ������ͨ���������ǽ�ԭʼ������Ϊһ����������װ���ߵĹ�������
���ǿ���������һ�仰���ܽ���Щ���ʹ�ô���ģʽ���������ʵ����֮��ĵĹ�ϵͨ���ڱ���ʱ���Ѿ�ȷ���ˣ���װ�����ܹ�������ʱ�ݹ�ر����졣    
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * ��ͨ�ľ�̬����: �ͻ��˲�֪������������ɴ����������书�ܵĵ���
		 */
		IGamePlayer proxy = new GamePlayerProxy("X");
		System.out.println("��ʼʱ���ǣ�" + new Date().toLocaleString());
		proxy.login("zhangSan", "abcd");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�" + new Date().toLocaleString());
		
		System.out.println();
		
		/*
		 * ������� ��ǿ�� ���������Ĺ���
		 */
		IGamePlayer proxy2 = new GamePlayerProxy2("M");
		proxy2.login("lisi", "efg");
		proxy2.killBoss();
		proxy2.upgrade();
		
		System.out.println();
		
		/*
		 * ��̬����ʹ��jdk�ṩ��InvocationHandler��������ñ��������ķ���
		 * 	���java.reflect.Proxy �����������
		 * ��̬���뱻���������InvocationHandler,��handler�е�invokeʱ������ǿ���������ķ����Ĺ���
		 * ����˵��(��������:)��ʲô�ط������ӵ㣩, ִ��ʲô��Ϊ��֪ͨ��
		 * GamePlayerProxy3���Ƿ�����Ϊloginʱ֪ͨ��ʼʱ�䣬upgradeʱ֪ͨ����ʱ��
		 */
		GamePlayerProxy3 dynamic = new GamePlayerProxy3(new GamePlayer("Y"));
		IGamePlayer dynamicPlayer = dynamic.getProxy();
		dynamicPlayer.login("wangwu", "1234");
		dynamicPlayer.killBoss();
		dynamicPlayer.upgrade();
		/*
		 * �������棺 һЩ���Ƶ�ҵ���߼���Ҫ�����ڶ�ĵط������ǾͿ��԰�����ȡ�������У� ����Ҳ������������:����־���桢Ȩ�����桢ҵ������
		 */
	}
}