package DesignPattern.P11_CompositePattern;

/**
 * 树	整体
 * 
 * @author stone
 * 
 */
public class Tree {
	private TreeNode root; //根节点

	public Tree(String name) {
		this.root = new TreeNode(name);
	}
	
	public TreeNode getRoot() {
		return root;
	}
}