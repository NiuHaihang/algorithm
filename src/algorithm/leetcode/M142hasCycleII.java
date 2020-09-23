package algorithm.leetcode;

import java.util.HashSet;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}

public class M142hasCycleII {
	public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hasNode = new HashSet();
        while(head != null){
            if(hasNode.contains(head)) return head;
            else {
            	hasNode.add(head);
            	head = head.next;
            }
        }
        return null;
    }
}
