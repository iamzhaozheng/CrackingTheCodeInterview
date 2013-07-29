package com.hisrv.cracking.chapter2;

import java.util.HashSet;

public class Problem1 {
	public void removeDuplicates(ListNode head) {
		HashSet<Integer> hash = new HashSet<Integer>();
		ListNode p = head;
		ListNode stPrev = new ListNode(0);
		stPrev.next = head;
		ListNode prev = stPrev;
		while (p != null) {
			if (hash.contains(p.val)) {
				prev.next = p.next;
			} else {
				hash.add(p.val);
				prev = p;
			}
			p = p.next;
		}
	}
	
	public void removeDuplicatesConstantSpace(ListNode head) {
		ListNode base = head;
		ListNode runner = head;
		while (base != null) {
			runner = base;
			while (runner.next != null) {
				if (runner.next.val == base.val) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			base = base.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.create();
//		new Problem1().removeDuplicates(head);
		new Problem1().removeDuplicatesConstantSpace(head);
		if (head != null) head.out();
	}
}
