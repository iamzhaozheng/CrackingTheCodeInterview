package com.hisrv.cracking.chapter4;

public class Problem1 {
	private int minDepth(TreeNode node) {
		return node == null ? 0 : Math.min(minDepth(node.left), minDepth(node.right));
	}
	
	private int maxDepth(TreeNode node) {
		return node == null ? 0 : Math.max(maxDepth(node.left), maxDepth(node.right));
	}
	
	public boolean isBalanced(TreeNode node) {
		return maxDepth(node) - minDepth(node) <= 1;
	}
}
