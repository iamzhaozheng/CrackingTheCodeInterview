package com.hisrv.cracking.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem4 {
	public List<LinkedList<TreeNode>> findLevelLinkedList(TreeNode root) {
		List<LinkedList<TreeNode>> ret = new ArrayList<LinkedList<TreeNode>>();
		if (root == null) {
			return ret;
		}
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		list.add(root);
		boolean flag = true;
		int level = 0;
		while (flag) {
			flag = false;
			ret.add(list);
			list = new LinkedList<TreeNode>();
			for (TreeNode node : ret.get(level)) {
				if (node.left != null) {
					list.add(node.left);
					flag = true;
				}
				if (node.right != null) {
					list.add(node.right);
					flag = true;
				}
			}
			level ++;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		String[] s = {"0", "1", "#", "2", "3"};
		TreeNode root = TreeBuilder.create(s);
		List<LinkedList<TreeNode>> ret = new Problem4().findLevelLinkedList(root);
		for (LinkedList<TreeNode> list : ret) {
			for (TreeNode node : list) {
				System.out.print(node.val + " ");
			}
			System.out.println();
		}
		
	}
}
