package DesignPattern.P11_CompositePattern;

/**
 * ��	����
 * 
 * @author stone
 * 
 */
public class Tree {
	private TreeNode root; //���ڵ�

	public Tree(String name) {
		this.root = new TreeNode(name);
	}
	
	public TreeNode getRoot() {
		return root;
	}
}