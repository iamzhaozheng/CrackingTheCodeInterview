package com.hisrv.cracking.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
	public TreeNode findFirstCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
		List<TreeNode> pathA =  findPath(root, a);
		List<TreeNode> pathB =  findPath(root, b);
		int i = 1;
		while (pathA.get(pathA.size() - i) == pathB.get(pathB.size() - i)) {
			i ++;
		}
		return pathA.get(pathA.size() - i + 1);
	}
	
	public List<TreeNode> findPath(TreeNode root, TreeNode node) {
		if (root == node) {
			List<TreeNode> path = new ArrayList<TreeNode>();
			path.add(node);
			return path;
		} else if (root == null) {
			return null;
		} else {
			List<TreeNode> pathLeft = findPath(root.left, node);
			List<TreeNode> pathRight = findPath(root.right, node);
			if (pathLeft != null) {
				pathLeft.add(root);
				return pathLeft;
			} else if (pathRight != null) {
				pathRight.add(root);
				return pathRight;
			} else {
				return null;
			}
		}
	}
	
	public static void main(String[] args) {
		Problem6 f = new Problem6();
		TreeNode root = TreeBuilder.create(new String[] {"0", "1", "2", "3" ,"4", "5", "6", "7"});
		TreeNode ret = f.findFirstCommonAncestor(root, root.right.left, root.right.right);
		System.out.println(ret.val);
	}
}
