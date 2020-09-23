package algorithm.nowcoder;

class ListNode1{
	int val;
	ListNode1 next;
	ListNode1(int x){
		val = x;
		next = null;
	}
}

public class HasCycle {
	public boolean hasCycle(ListNode1 head) {
		if(head == null || head.next == null || head.next.next == null) return false;
		ListNode1 p1 = head.next;
		ListNode1 p2 = p1.next;
		
		while(p1 != null && p2 != null) {
			if(p1 == p2) return true;
			p1 = p1.next;
			p2 = p2.next;
			if(p1 != null) p2 = p2.next;
		}

		return false;
	}
}
