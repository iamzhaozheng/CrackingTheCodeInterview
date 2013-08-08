package com.hisrv.cracking.chapter4;

public class Problem5 {
	TreeNodeWithParent findNextNode(TreeNodeWithParent node) {
		if (node.parent == null) {
			return (TreeNodeWithParent)leftMost(node.right);
		} else if (node.parent.left == node) {
			return (TreeNodeWithParent)node.parent;
		} else {
			return findNextNode((TreeNodeWithParent)node.parent);
		}
	}
	
	TreeNode leftMost(TreeNode node) {
		if (node == null) {
			return null;
		}
		if (node.left == null) {
			return node;
		} else {
			return leftMost(node.left);
		}
	}
	
	public static void main(String[] args) {
		String[] l = new String[]{"0", "1", "2", "3", "4"};
		TreeNodeWithParent root = TreeBuilder.createWithParent(l);
		System.out.print((new Problem5().findNextNode((TreeNodeWithParent)root.left.right)).val);
	}
}
