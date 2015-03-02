package DesignPattern.P11_CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 树节点 部份
 * 也可以自身代表树：一堆节点组成了一颗树
 * 
 * @author stone
 * 
 */
public class TreeNode {

	private String name;
	private TreeNode parent;
	private List<TreeNode> children;
	
	public TreeNode(String name) {
		this.name = name;
		this.children = new ArrayList<TreeNode>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public TreeNode getParent() {
		return parent;
	}
	
	public List<TreeNode> getChildren() {
		return children;
	}
	
	public void add(TreeNode node) {
		this.children.add(node);
	}
	
	public void remove(TreeNode node) {
		this.children.remove(node);
	}
}


