package DesignPattern.P12_FlyweightPattern;

/*
 * ��Ԫ(Flyweight)ģʽ	�ṹ��ģʽ		��ҪĿ����ʵ�ֶ���Ĺ���
 * 		�����Ͽ����� һ�� ����Ԫ����ģʽ�������ǽ� һЩ��ϵͳ����Ҫ�ظ�ʹ�õĶ��󣬹���ɵ���Ԫ��
 * 
 *  ��JDBC���ݿ����ӳء��̳߳ص� ����Ӧ������Ԫģʽ
 *  	���ݿ����ӳ�: ������һ�����������ӣ�������У��õ�ʱȡ�����ͷ�ʱ�ٴ���
 *  	�س̳أ����ƣ�Ҳ�� �õ�ʱȡ�����ͷ�ʱ�ٴ���
 *  ����һ�� ������һ���������洢Ԫ������һ����Ԫ��������Ԫ���Ĺ���
 */
public class Test {
	public static void main(String[] args) {
		LetterFactory factory = LetterFactory.getInstance();
		String word = "easiness";
		addLetterByName(factory, word);
		
		getLetter(factory, word);
	}
	//�����ĸ����
	static void addLetterByName(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			factory.add(new Letter(c + ""));
		}
	}
	//�����ĸ����
	static void getLetter(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			System.out.println(factory.get(c + ""));
		}
	}
}
