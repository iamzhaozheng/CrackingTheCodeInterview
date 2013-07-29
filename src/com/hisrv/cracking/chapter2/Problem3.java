package com.hisrv.cracking.chapter2;

public class Problem3 {
	public ListNode deleteMid(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode slow = head, fast = head.next;
		ListNode stPrev = new ListNode(0);
		stPrev.next = head;
		ListNode prev = stPrev;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;
		head = stPrev.next;
		return head;
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.create(1, 2, 3, 4, 5);
		head = new Problem3().deleteMid(head);
		if (head != null) head.out();
	}
}
