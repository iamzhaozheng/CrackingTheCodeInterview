package com.hisrv.cracking.chapter2;

public class Problem4 {
	public ListNode sum(ListNode l1, ListNode l2) {
		ListNode p1 = l1, p2 = l2;
		ListNode ret = null, prev = null;
		int carry = 0;
		while (p1 != null || p2 != null) {
			int num = 0;
			if (p1 == null) {
				num = p2.val + carry;
				p2 = p2.next;
			} else if (p2 == null) {
				num = p1.val + carry;
				p1 = p1.next;
			} else {
				num = p1.val + p2.val + carry;
				p1 = p1.next;
				p2 = p2.next;
			}
			carry = num / 10;
			ListNode p = new ListNode(num % 10);
			if (prev == null) {
				ret = p;
			} else {
				prev.next = p;
			}
			prev = p;
		}
		if (carry > 0) {
			prev.next = new ListNode(carry);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		ListNode ret = new Problem4().sum(ListNode.create(0), ListNode.create(0));
		if (ret != null) {
			ret.out();
		}
	}
}
