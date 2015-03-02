package DesignPattern.P11_CompositePattern;

import java.util.LinkedList;
import java.util.List;

/*
 * ���(Composite)ģʽ  �ֽ�������-����ģʽ
 * ��ʹ���ǲ㼶�����νṹ�������У�ģ���˼�Ԫ�غ͸���Ԫ�صĸ���ͻ�������������Ԫ��һ����������Ԫ��,�Ӷ�ʹ�ÿͻ������븴��Ԫ�ص��ڲ��ṹ����
 * �������������Compositeģʽ��
		1�������ʾ����Ĳ���-�����νṹ
		2����ϣ���û�������϶����뵥������Ĳ�ͬ���û���ͳһ��ʹ����Ͻṹ�е����ж���
 */
public class Test {
	public static void main(String[] args) {
//		Tree treeA = new Tree("A");
//		treeA.getRoot().add(new TreeNode("B"));
//		treeA.getRoot().add(new TreeNode("C"));
//		TreeNode treeNodeD = new TreeNode("D");
//		treeNodeD.add(new TreeNode("D1"));
//		treeNodeD.add(new TreeNode("D2"));
//		treeA.getRoot().add(treeNodeD);
//		print(treeA.getRoot());
		/*
		 * ����ʹ����Tree����
		 * ����ֻʹ��TreeNode���󣬷������ģʽ�Ķ��壬�ȴ�����Ҳ��������
		 */
		TreeNode treeA = new TreeNode("A");
		treeA.add(new TreeNode("B"));
		treeA.add(new TreeNode("C"));
		TreeNode treeNodeD = new TreeNode("D");
		treeNodeD.add(new TreeNode("D1"));
		treeNodeD.add(new TreeNode("D2"));
		treeA.add(treeNodeD);
		print(treeA);
		/*
		 * ����ʾ�����ļ�ϵͳ{Ŀ¼���ļ�}, �������ֿ��õݹ�����Ľṹ��
		 * ��һ��������ܱ�ʾ���������壬�����������ģʽ
		 */

	}
	
	public static void print(TreeNode root) {
		if (root == null) return;
		LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();  
		linkedList.add(root);
		while (!linkedList.isEmpty()) {
			TreeNode node = linkedList.removeFirst();
			System.out.println(node.getName());
			List<TreeNode> children = node.getChildren();
			for (int i = 0; i < children.size(); i++) {
				TreeNode next = children.get(i);
				List<TreeNode> children2 = next.getChildren();
				if (!children2.isEmpty()) {
					linkedList.add(next);
				} else {
					System.out.println(next.getName());
				}
			}
		}
	}
}